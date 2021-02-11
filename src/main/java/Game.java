import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void play(Field player1, Field player2) {
        player1.setCounthit(0);
        player2.setCounthit(0);
        Field.createNewGame(player1,player2);
        boolean firstplayer = false;
        Random random = new Random();
        int swtch = random.nextInt(2);
        if (swtch == 0) {
            System.out.println("Первым(ой) ходит " + player1.getName());
            shoot(player2);
            firstplayer = true;
        } else {
            System.out.println("Первым(ой) ходит " + player2.getName());
            shoot(player1);
        }
        if (firstplayer) {
            System.out.println("Ходит " + player2.getName());
            shoot(player1);
        }
        while (true) {
            System.out.println("Ходит " + player1.getName());
            shoot(player2);
            if (player2.getCounthit() == player2.getMAXCAOUNTHIT()) {
                System.out.println("Игра окончена, победил(а) " + player1.getName());
                break;
            }
            System.out.println("Ходит " + player2.getName());
            shoot(player1);
            if (player1.getCounthit() == player1.getMAXCAOUNTHIT()) {
                System.out.println("Игра окончена, победил(а) " + player2.getName());
                break;
            }
        }
    }

    public static void shoot(Field field) {
        boolean continue1;//переменная для проверки на корректность координат
        boolean continue2;//переменная для продолжения стрельбы при попадании
        while (true) {
            continue2 = false;
            while (true) {
                if (field.getCounthit() == field.getMAXCAOUNTHIT()) break;
                continue1 = false;
                System.out.println("Для стрельбы введите координаты в формате x,y от 0 до 9");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String[] coordinatesStr = line.split(",");
                if (coordinatesStr.length != 2) {
                    System.out.println("Неверный формат ввода");
                    continue;
                }

                int[] coordinates = new int[2];

                for (int i = 0; i < coordinatesStr.length; i++) {
                    try {
                        coordinates[i] = Integer.parseInt(coordinatesStr[i]);
                        if (coordinates[i] < 0 || coordinates[i] > 9) {
                            System.out.println("Координаты не могут быть меньше 0 и больше 9");
                            continue1 = true;
                            break;
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("Неверный формат ввода");
                        continue1 = true;
                    }
                }
                if (continue1) continue;
                if (field.getFieldCells()[coordinates[0]][coordinates[1]] == Cell.SHIP) {
                    field.setFieldCells(Cell.DEADPART, coordinates[0], coordinates[1]);
                    shipCeck(field, coordinates);
                    continue2 = true;
                    field.setCounthit(field.getCounthit() + 1);
                } else {
                    System.out.println("Мимо!");
                    continue2 = false;
                    break;
                }
            }

            if (continue2) continue;
            break;
        }
    }

    public static void shipCeck(Field field, int[] array) {
        boolean death = true;
        if (array[0] > 0) {
            if (field.getFieldCells()[array[0] - 1][array[1]] == Cell.SHIP) {
                System.out.println("Ранил!");
                death = false;
            }
        }
        if (array[0] < 9) {
            if (field.getFieldCells()[array[0] + 1][array[1]] == Cell.SHIP) {
                System.out.println("Ранил!");
                death = false;
            }
        }
        if (array[1] > 0) {
            if (field.getFieldCells()[array[0]][array[1] - 1] == Cell.SHIP) {
                System.out.println("Ранил!");
                death = false;
            }
        }
        if (array[1] < 9) {
            if (field.getFieldCells()[array[0]][array[1] + 1] == Cell.SHIP) {
                System.out.println("Ранил!");
                death = false;
            }
        }
        if (death) System.out.println("Убил!");
    }
}