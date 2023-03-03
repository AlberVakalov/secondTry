package day11.task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed = false;
    private Warehouse w;

    public Picker(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        w.incrementCountPickedOrders();
        salary += 80;

    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10000)
            System.out.println("Бонус пока не доступен");
        else if (isPayed)
            System.out.println("Бонус уже был выплачен");
        else
            salary += 70000;
        isPayed = true;
    }


}
