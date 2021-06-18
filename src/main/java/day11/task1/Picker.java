package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int TASK_SALARY = 80;
    private Warehouse w;
    private boolean isPayed;

    @Override
    public String toString() {
        return "Picker{" +
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


    public Picker(Warehouse w) {
        this.w = w;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10.000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 70000;
        isPayed = true;
    }
}
