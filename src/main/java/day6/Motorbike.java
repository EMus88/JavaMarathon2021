package day6;

public class Motorbike {
    private int year;
    private String color;

    public Motorbike(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    void info() {
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int inputYear) {
        int difference = inputYear - this.year;
        return difference;
    }
}
