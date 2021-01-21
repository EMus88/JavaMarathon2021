package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        int b = s2.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
            System.exit(0);
        }
        int counter = 0; //счетчик
        System.out.println("Числа, которые делятся на 5 без остатка и не делятся на 10 без остатка:");
        for (int i = a; i <= b; i++) {
            int ost1 = i % 5;
            int ost2 = i % 10;
            if (ost1 == 0 && ost2 != 0) {
                System.out.println(i);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("отсутствуют");
        }
    }
    }

