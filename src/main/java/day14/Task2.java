package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }


    public static List<String> parseFileToStringList() {
        File file1 = new File("People.txt");
        List<String> nameAndAge = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file1);

            while (sc.hasNextLine()) {
                String allLine = sc.nextLine();

                String[] line = allLine.split(" ");
                int age = Integer.parseInt(line[1]);

                if (age < 0) {
                    throw new IllegalAccessException("Неверные данные");
                }

                nameAndAge.add(allLine);
            }
        } catch (FileNotFoundException | IllegalAccessException f) {
            System.out.println(f.getMessage());
        }
        return nameAndAge;
    }
}
