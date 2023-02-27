package day8;

public class Task1 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String x = " ";
        for (int i = 0; i <= 20000; i++)
            x += i + " ";


        System.out.println(x);
        long stopTime = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс: " + (stopTime - startTime));


        long startTimer = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i <= 20000; i++)
            sb.append(i).append(" ");

        System.out.println(sb);

        long stopTimer = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс: " + (stopTimer - startTimer));

        //There is a 476ms difference
    }

}
