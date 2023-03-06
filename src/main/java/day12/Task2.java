package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.println(setNumbers(numberList));
    }

    public static ArrayList<Integer> setNumbers(ArrayList<Integer> numbersList) {
        for (int i = 0; i < 35; i++) {
            if (i % 2 == 0)
                numbersList.add(i);
        }

        for (int i = 300; i < 350; i++) {
            if (i % 2 == 0)
                numbersList.add(i);
        }
        return numbersList;
    }
}

