package day1;

public class Task4 {
    public static void main(String[] args) {
        int year = 1976;
        int count = 4;
        while (year < 2020) {
            year += count;
            System.out.println("Олимпиада " + year + " года");
        }
    }
}
