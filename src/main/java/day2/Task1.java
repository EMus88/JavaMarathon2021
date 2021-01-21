package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите кол-во этажей: ");
        int floor=s.nextInt();
        if (floor<1)  {
            System.out.println("Ошибка ввода");
            System.exit(0);
        }
        if (floor <=4 && floor>=1 ) {
            System.out.println("Ваш дом малоэтажный");
        }
        if (floor <=8 && floor>=5 ) {
            System.out.println("Ваш дом среднеэтажный");
        }
        if (floor >=9 ) {
            System.out.println("Ваш дом многоэтажный");
        }
    }
}
