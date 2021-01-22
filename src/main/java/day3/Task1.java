package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        boolean stop = true;
        Scanner s = new Scanner(System.in);
        while (stop) {
            System.out.println("Введите название города");
            String city = s.nextLine();
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кельн":
                    System.out.println("Германия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "stop":
                    stop = false;
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}

