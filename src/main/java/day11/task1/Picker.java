package day11.task1;

public class Picker implements Worker {
    private boolean isPayed = false;
    private int salary;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Picker(int salary, Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public String toString() {
        return "Выплачивалась премия? " + isPayed + " Зарплата: " + salary;
    }

    @Override
    public void doWork() {
        this.salary = this.salary + 80;
        warehouse.countPickedOrders = warehouse.countPickedOrders + 1;
        if (warehouse.countPickedOrders == 10000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        if (warehouse.countPickedOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (!isPayed) {
            this.salary = this.salary + 70000;
            isPayed = true;
        } else System.out.println("Бонус уже выплачен");
    }

}
