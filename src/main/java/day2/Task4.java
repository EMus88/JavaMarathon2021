package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner s = new Scanner(System.in);
        Double x=s.nextDouble();
        Double y;
        if (x>=5){
            y=(Math.pow(x,2)-10)/(x+7);
            System.out.println("y = (x2-10)/(x+7) = "+y);
        }
        else if (x>-3 && x<5){
            y=(x+3)*(Math.pow(x,2)-2);
            System.out.println("y = (x+3) x (x2-x) = "+y);
        }
        else {
            y= 420d;
            System.out.println("y = "+y);
        }
    }
}
