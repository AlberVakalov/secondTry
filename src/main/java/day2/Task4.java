package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        if (x >= 5.0) {
            double y1;
            y1 = ((x * x) - 10) / (x + 7);
            System.out.println(y1);
        }
        else if (x > -3 && 5 > x){
            double y2;
            y2 = (x + 3) * ((x * x) - 2);
            System.out.println(y2);
        }
        else {
            double y3 = 420;
            System.out.println(y3);
        }
    }
}
