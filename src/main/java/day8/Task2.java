package day8;

public class Task2 {
    public static void main(String[] args) {
        Airplane a320 = new Airplane("Airbus", 1987, 545, 1789);
        a320.fillUp(250);
        System.out.println(a320);
    }
}
