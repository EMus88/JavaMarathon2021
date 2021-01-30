package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse sklad1 = new Warehouse();
        Warehouse sklad2 = new Warehouse();
        Picker picker1 = new Picker(0, sklad1);
        Courier courier1 = new Courier(0, sklad1);
        Picker picker2 = new Picker(0, sklad2);
        Courier courier2 = new Courier(0, sklad2);

        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());
        System.out.println(sklad1.getCountPickedOrders());
        System.out.println(sklad1.getCountDeliveredOrders());

        businessProcess(picker2);
        businessProcess(courier2);
        System.out.println(picker2.toString());
        System.out.println(courier2.toString());
        System.out.println(sklad2.getCountPickedOrders());
        System.out.println(sklad2.getCountDeliveredOrders());

        System.out.println(sklad1.getCountPickedOrders());
        System.out.println(sklad1.getCountDeliveredOrders());

    }

    static void businessProcess(Worker worker) {
        for (int i = 1; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
