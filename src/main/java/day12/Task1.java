package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();

        carList.add("BMW");
        carList.add("Toyota");
        carList.add("Renault");
        carList.add("Audi");
        carList.add("Volga");

        System.out.println(carList);

        carList.add(3, "Zhiguli");


        carList.remove(0);

        System.out.println(carList);


    }
}
