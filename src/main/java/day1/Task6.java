
package day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите цифру от 1 до 9: ");
        int k=s.nextInt();
        if (k<1 | k>9) {
            System.out.println("Вы ввели неверное значение");
            System.exit(0);
        }
        System.out.println("Таблица умножения ждля вашей цифры:");
        for (int i=1;i<=9;i++){
            System.out.println(i+"\tx\t"+k+"\t=\t"+i*k);
        }
    }
}

