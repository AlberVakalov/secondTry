package day1;

public class Task5 {
    public static void main(String[] args) {
        int year = 1980;
        for (int i = 4; 2020 >= year; year += i){
            System.out.println("Олимпиада " + year + " года");
        }
    }
}
