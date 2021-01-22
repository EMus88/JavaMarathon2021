package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            Double a = s.nextDouble();
            Double b = s.nextDouble();
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            double result = a / b;
            System.out.println("Результат деления:" + result);
        }
    }
}

