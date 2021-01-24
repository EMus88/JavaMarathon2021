package day5;

public class Task1 {
    public static void main(String[] args) {
        Car gaz = new Car();
        gaz.setYear(1987);
        gaz.setColor("Green");
        gaz.setModel("Gaz 31029");
        System.out.println("Модель: " + gaz.getModel());
        System.out.println("Цвет: " + gaz.getColor());
        System.out.println("Год выпуска: " + gaz.getYear());
    }
}
