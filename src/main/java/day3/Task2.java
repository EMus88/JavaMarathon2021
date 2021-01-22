package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean stop = true;
        while (stop) {
            Double a = s.nextDouble();
            Double b = s.nextDouble();
            if (b == 0) {
                break;
            }
            double result = a / b;
            System.out.println("Результат деления:" + result);
        }
    }
}
