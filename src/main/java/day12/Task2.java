package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        System.out.println(setNumbers(numberList, 0, 36));
        System.out.println(setNumbers(numberList, 300, 351));
    }

    public static List<Integer> setNumbers(List<Integer> numbersList, int x , int y) {
        for (int i = x; i < y; i++)
            if (i % 2 == 0)
                numbersList.add(i);
        return numbersList;
    }
}

