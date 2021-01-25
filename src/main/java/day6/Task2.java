package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane A320 = new Airplane("Airbus", 1978, 54, 2046);
        A320.setYear(2014);
        A320.setLength(47);
        A320.fillUp(120);
        A320.fillUp(142);
        A320.info();
    }
}
