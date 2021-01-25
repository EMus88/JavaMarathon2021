package day6;

public class Task1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setModel("Priora");
        lada.setColor("Baklagan");
        lada.setYear(2015);
        lada.info();
        System.out.println(lada.getModel());
        System.out.println(lada.getColor());
        System.out.println(lada.getYear());
        System.out.println(Math.abs(lada.yearDifference(2070)));

        Motorbike suzuki = new Motorbike(1995, "Yellow");
        suzuki.info();
        System.out.printf(suzuki.getYear() + "\n" + suzuki.getColor() + "\n");
        System.out.println(Math.abs(suzuki.yearDifference(1985)));
    }
}
