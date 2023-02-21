package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbikeHarley = new Motorbike("Harley-Davidson", "Yellow", 1936);
        Motorbike motorbikeHonda = new Motorbike("Honda CB750", "Blue", 1985);
        Motorbike motorbikeBMW = new Motorbike("BMW R720", "Purple", 1981);

        motorbikeBMW.getInfo();
        motorbikeHarley.getInfo();
        motorbikeHonda.getInfo();

    }
}
