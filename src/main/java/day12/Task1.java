package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("Lada");
        cars.add("Gaz");
        cars.add("Toyota");
        cars.add("BMW");
        System.out.println(cars);

        cars.add(cars.size()/2,"Suziki");
        cars.remove(0);
        System.out.println(cars);
    }
}
