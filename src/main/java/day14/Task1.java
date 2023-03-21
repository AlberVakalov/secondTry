package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers");
        try {
            Scanner scanner = new Scanner(file);
            String[] numbers = scanner.nextLine().split(" ");
            if (numbers.length != 10)
                throw new IllegalArgumentException("Неверные данные");


        } catch (FileNotFoundException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        printSumDigits(file);

    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String[] numbers = scanner.nextLine().split(" ");
        int sum = 0;
        for (String number : numbers){
            sum+=Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}
