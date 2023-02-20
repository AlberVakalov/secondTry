package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        int maxIndex = 0;
                int maxSum = 0;
        Random random = new Random();

        for (int row = 0; row < 12; row++) {
            for (int colone = 0; colone < 8; colone++) {
                matrix[row][colone] = random.nextInt(50);
            }
        }
        for (int row = 0; row < 12; row++) {
            int sum = 0;
            for (int colone = 0; colone < 8; colone++) {
                sum += matrix[row][colone];
                System.out.print(matrix[row][colone] + " ");
            }
            System.out.print(" = " + sum);
            System.out.println();
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = row;
            }
        }
        System.out.println();
        System.out.println(maxIndex);


    }
}
