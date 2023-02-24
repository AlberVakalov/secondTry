package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane airplane = new Airplane("Самолет1",1925, 100,1000);


    airplane.setManufacture("Самолет 3");
    airplane.setYear(2005);
    airplane.fillUp(10000);
    airplane.setLength(1000);
    airplane.setWeight(200000);

    airplane.info();
    }
}
