package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers");
        try {
            Scanner scanner = new Scanner(file);
            String[] numbers = scanner.nextLine().split(" ");
            if (numbers.length != 10)
                System.out.println("Неккоректное количество значений");


        } catch (FileNotFoundException e) {
            System.out.println("Ошибка, файл не найден");
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
