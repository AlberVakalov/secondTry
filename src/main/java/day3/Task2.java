package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0)
                break;
            else {
                System.out.println(a / b);
            }
        }
    }
}
