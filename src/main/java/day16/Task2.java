package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        try {
            File file = new File("file1.txt");
            PrintWriter pw = new PrintWriter(file);
            final int numbers = 1000;
            for (int i = 0; i < numbers; i++) {
                pw.println(random.nextInt(100));
            }
            pw.close();

            Scanner scanner = new Scanner(file);
            File file2 = new File("File2.txt");
            PrintWriter pw2 = new PrintWriter(file2);
            int cou = 0;
            int sum = 0;
            while (scanner.hasNextLine()) {
                sum += Integer.parseInt(scanner.nextLine());
                cou++;

                final double length = 20.0;
                if (cou == length) {
                    pw2.println(sum / length);

                    sum = 0;
                    cou = 0;
                }

            }
            pw2.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
