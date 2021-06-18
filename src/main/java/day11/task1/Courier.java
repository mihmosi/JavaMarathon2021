package day11.task1;

public class Courier implements Worker {
    private int salary;
    private static final int TASK_SALARY = 100;
    private boolean isPayed;
    public Warehouse w;

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + getSalary() +
                ", isPayed=" + isPayed() +
                '}';
    }

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
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() < 10.000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 50000;
        isPayed = true;
    }
}
