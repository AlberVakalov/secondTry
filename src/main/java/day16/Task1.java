package day16;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

    File file = new File("C:\\Users\\Alik\\IdeaProjects\\secondTry\\src\\main\\java\\day16\\NUMBERS");
        System.out.println(printResult(file));
    }
    public static double printResult(File file) {
        double sum = 0;
        double scale = Math.pow(10, 3);

        try {
            Scanner sc = new Scanner(file);
            String[] numbers = sc.nextLine().split(" ");
            sum = 0;
            for (String x : numbers) {
                sum += Integer.parseInt(x);
            }
            sum = sum / numbers.length;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return Math.ceil(sum * scale) / scale;
    }


}

