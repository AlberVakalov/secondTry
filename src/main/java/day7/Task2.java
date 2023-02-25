package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player akinfeev = new Player(100);
        Player dzyba = new Player(100);
        Player ronaldo = new Player(100);

        Player.info();

        Player andreev = new Player(95);
        Player belkin = new Player(95);
        Player murativ = new Player(95);
        Player.info();

        for (int i = 0; i < 100; i++) {
            ronaldo.run();
            dzyba.run();
        }

        Player.info();

    }
}
