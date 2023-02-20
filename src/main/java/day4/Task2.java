package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = random.nextInt(10000);


        int max = 0;
        for (int x : numbers) {
            if (x > max)
                max = x;
        }
        System.out.println(max);

        int min = 10001;
        for (int y : numbers) {
            if (y < min)
                min = y;
        }
        System.out.println(min);

        int count0 = 0;
        for (int f : numbers) {
            if (f % 10 == 0)
                count0++;
        }
        System.out.println(count0);

        int sum = 0;
        for (int j : numbers) {
            if (j % 10 == 0)
                sum += j;
        }
        System.out.println(sum);
    }
}
