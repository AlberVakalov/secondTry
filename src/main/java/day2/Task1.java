package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int scanner = x.nextInt();
        if (scanner <= 0) {
            System.out.println("Ошибка ввода");
        }
        else if (4 >= scanner){
            System.out.println("Малоэтажный дом");
        } else if (scanner <= 8) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
