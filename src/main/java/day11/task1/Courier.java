package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed = false;
    private int bonusPay;

    private Warehouse w;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Courier(Warehouse w) {
        this.w = w;


    }

    @Override
    public String toString() {
        return "Courier{ " +
                "salary= " + salary +
                ", isPayed= " + isPayed;
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        else if(isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        else
            salary += 50000;
        isPayed=true;
    }

    @Override
    public void doWork() {
        w.incrementCountDeliverOrders();
        salary += 100;

    }
}
