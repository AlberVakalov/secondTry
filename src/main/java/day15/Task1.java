package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Alik\\IdeaProjects\\secondTry\\src\\main\\resources\\shoes.csv");
        Scanner sc = new Scanner(file);

        File file1 = new File("C:\\Users\\Alik\\IdeaProjects\\secondTry\\src" +
                "\\main\\resources\\Missing_shoes.txt");
        PrintWriter printWriter = new PrintWriter(file1);

        while (sc.hasNextLine()) {

            String allShoe = sc.nextLine();
            String[] all = allShoe.split(";");

            if (Integer.parseInt(all[2]) == 0)
                printWriter.println(all[0] + " : " + all[1] + " : " + all[2]);
        }

        printWriter.close();
        sc.close();
    }
}
