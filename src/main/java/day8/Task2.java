package day8;

public class Task2 {
    public static void main(String[] args) {
    Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);
        Airplane airplane2 = new Airplane("jojo", 2005, 100, 110000);

        System.out.println(airplane2);
        Airplane.compareAirplanes(airplane, airplane2);

    }
}
