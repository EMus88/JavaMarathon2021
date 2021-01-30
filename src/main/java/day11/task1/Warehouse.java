package day11.task1;

public class Warehouse {
    public int countPickedOrders;
    public int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString() {
        return "количество собранных заказов" + countPickedOrders + "\n" + "количество доставленных заказов" + countDeliveredOrders;
    }

}
