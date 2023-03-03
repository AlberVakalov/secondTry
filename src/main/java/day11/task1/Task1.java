package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        businessProcess(courier);
        System.out.println(courier);

        businessProcess(picker);
        System.out.println(picker);


    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++)
            worker.doWork();


        worker.bonus();
    }

}
