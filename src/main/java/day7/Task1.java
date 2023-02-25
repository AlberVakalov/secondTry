package day7;

public class Task1 {
    public static void main(String[] args) {
    Airplane boeing = new Airplane("BOEING", 2010, 100000, 20000000);
    Airplane pobeda = new Airplane("POBEDA", 2000, 10000, 180000);
    Airplane.compareAirplanes(boeing, pobeda);
    }
}