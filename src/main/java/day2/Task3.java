package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int a1 = a + 1;
        while (a1 < b) {
            if (a1 % 5 == 0 && a1 % 10 != 0)
                System.out.print(a1 + " ");
            a1++;
        }
        while (a1 > b) {
            System.out.println("Некорректный ввод");
            break;
        }
    }
}
