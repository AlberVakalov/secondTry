package day5;

public class Task1 {
    public static void main(String[] args) {
    Car car = new Car();
    car.setModel("Toyota");
    car.setAgeCar(12);
    car.setColor("Black");
        System.out.println(car.getAgeCar() + " " + car.getModel() + " " + car.getColor());
    }
}
