package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Courier(int salary, Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;

    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "Выплачивалась премия? " + isPayed + " Зарплата: " + salary;
    }

    @Override
    public void doWork() {
        this.salary = this.salary + 100;
        warehouse.countDeliveredOrders = warehouse.countDeliveredOrders + 1;
        if (warehouse.countDeliveredOrders == 10000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        if (warehouse.countPickedOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (!isPayed) {
            this.salary = this.salary + 50000;
            isPayed = true;
        } else System.out.println("Бонус уже выплачен");
    }
}
