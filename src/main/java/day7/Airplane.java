package day7;

public class Airplane {
    private String producer; //изготовитель
    private int year; //год выпуска
    private int length; //длина
    private int weight; //вес
    private int fuel; //количество топлива в баке

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    void info() {
        System.out.printf("Изготовитель: " + this.producer + " год выпуска: " + this.year + "\n" + "длина: " + this.length + " вес: " + this.weight + " количество топлива в баке: " + this.fuel + "\n");
    }

    void fillUp(int n) {
        this.fuel = n;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if ((airplane1.length - airplane2.length) > 0) {
            System.out.println("Самолет №1 длиннее");
        } else {
            System.out.println("Самолет #2 длиннее");
        }


    }
}