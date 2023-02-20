package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = random.nextInt(10);

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int count8 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 8)
                count8++;
        }
        System.out.println(count8);

        int equal1 = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 1)
                equal1++;
        }
        System.out.println(equal1);

        int even = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0)
                even++;
        }
        System.out.println(even);

        int odd = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0)
                odd++;
        }
        System.out.println(odd);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
