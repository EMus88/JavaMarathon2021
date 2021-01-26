package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a320 = new Airplane("Airbus", 1995, 145, 4561);
        Airplane boing747 = new Airplane("Boing", 2001, 87, 3214);
        Airplane.compareAirplanes(a320, boing747);
    }
}