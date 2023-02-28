package day8;

public class Airplane {

    private String manufacture;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacture, int year, int weight, int length) {
        this.manufacture = manufacture;
        this.year = year;
        this.weight = weight;
        this.length = length;
        this.fuel = 0;

    }


    public void fillUp(int fuel) {
        this.fuel += fuel;
    }


    public void setFuel(int inFuel) {
        this.fuel = inFuel;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }


    public void setLength(int length) {
        this.length = length;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public int getLength() {
        return length;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacture + ", год выпуска: " + year + ", длина: " + length +
                " " + ", вес: " + weight + ", кол-во топлива: " + fuel);
    }

    public static void compareAirplanes(Airplane air1, Airplane air2) {
        if (air1.getLength() > air2.getLength())
            System.out.println("Длинее первый самолет");
        else if (air1.getLength() < air2.getLength())
            System.out.println("Длинее второй самолет");
        else
            System.out.println("Самолеты равны");
    }

    public String toString() {
        return manufacture + " " + year + " " + weight + " " + length;
    }

}
