package day6;

public class Airplane {

     String manufacture;
     int year;
     int length;
     int weight;
    int fuel;

    public Airplane(String manufacture, int year, int weight, int length){
        this.manufacture = manufacture;
        this.year = year;
        this.weight = weight;
        this.length = length;
        this.fuel = 0;
        info();

    }



    public void fillUp(int fuel){
        this.fuel = fuel;
    }


    public void setFuel(int inFuel) {
        fuel += inFuel;
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
    public void info(){
        System.out.println("Изготовитель: " + manufacture + ", год выпуска: " + year + ", длина: " + length +
                " " + ", вес: " + weight + ", кол-во топлива: " + fuel);
    }
}
