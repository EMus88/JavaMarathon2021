
import java.util.Scanner;

public enum Ship {
    FOURTHSHIP(4, "четырехпалубного", "x1,y1;x2,y2;x3,y3;x4,y4"), //четырехпалубный корабль состоит из 4-х ячеек типа "SHIP"
    TRIPLESHIP(3, "трехпалубного", "x1,y1;x2,y2;x3,y3"), //трехпалубный корабль состоит из 3-х ячеек типа "SHIP"
    DOUBLESHIP(2, "двухпалубного", "x1,y1;x2,y2"), //двухпалубный корабль состоит из 2-х ячеек типа "SHIP"
    SINGLESHIP(1, "однопалубного", "x1,y1"); //однопалубный корабль состоит из одной ячайки типа "SHIP"


    private final int LENGHT;
    private final String TYPE;
    private final String FORMAT;
    private static boolean horizontal;
    private static boolean vertical;
    private static boolean oreolCheck;

    Ship(int LENGTH, String TYPE, String FORMAT) {
        this.LENGHT = LENGTH;
        this.TYPE = TYPE;
        this.FORMAT = FORMAT;
    }

    public static void addShipToField(Field field, Ship ship) { //добавление корабля на поле
        String[] coordinatesStr;
        oreolCheck = false;
        int[][] coordinates = new int[ship.LENGHT][2];
        int lenght = 0;
        boolean continue1 = false;

        while (true) {
            int countI = 0;
            int countJ = 0;
            continue1 = false;
            oreolCheck=false;
            System.out.println("Введите коордитаны " + ship.TYPE + " корабля в формате " + ship.FORMAT + " от 0 до 9");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            String[] pairs = line.split(";");
            if (pairs.length != ship.LENGHT) {  //если пар координат меньше количества палуб корабля - повторный запрос
                System.out.println("Неверный формат ввода");
                continue;
            }

            for (int i = 0; i < pairs.length; i++) {
                coordinatesStr = pairs[i].split(",");
                lenght = coordinatesStr.length;
                if (coordinatesStr.length != 2) { //если количество координат в паре меньше двух - повторный запрос
                    continue1 = true;
                    System.out.println("Неверный формат ввода");
                    break;
                }
                try { //проверка на корректность типа данных (если введено не целое число)
                    for (int j = 0; j < 2; j++) {
                        coordinates[i][j] = Integer.parseInt(coordinatesStr[j]);
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Неверный формат ввода");
                    continue1 = true;
                    break;
                }
            }
            if (continue1) continue;

            for (int i = 0; i < coordinates.length; i++) {
                for (int j = 0; j < 2; j++) {
                    if (coordinates[i][j] < 0 || coordinates[i][j] > 9) { //проверка на соответствие координат размеру игрового поля
                        System.out.println("Неверный формат ввода,координата не может быть больше 9 и меньше 0");
                        continue1 = true;
                        break;
                    }
                }
            }
            if (continue1) continue;

            coordinates = sortCoordinates(coordinates); //сортировка координат по порядку

            for (int i = 0; i < coordinates.length - 1; i++) { //проверка корабля на валидность
                if ((coordinates[i + 1][0] - coordinates[i][0] == 1)) countJ++;
                if ((coordinates[i + 1][1] - coordinates[i][1] == 1)) countI++;
            }
            if (vertical && countJ != coordinates.length - 1) { //если корабль вертикальный и все координаты x отличаются на единицу
                System.out.println("Корабль не валидный");
                continue;
            } else if (horizontal && countI != coordinates.length - 1) {//если корабль горизонтальный и все координаты y отличаются на единицу
                System.out.println("Корабль не валидный");
                continue;
            } else if (!horizontal && !vertical) {//если корабль не вертикальный и не горизонтальный
                System.out.println("Корабль не валидный");
                continue;
            }
            if (ship.LENGHT!=4){
                oreolCheck(field, coordinates);//проветка на попадение в ореа другого корабля;
            }
            if (oreolCheck) {
                System.out.println("Корабль попадает в поле другого корабля");
                continue;
            }
            break;
        }
        for (int i = 0; i < coordinates.length; i++) { //если все ок - заполнение поля по указанным координатам
            field.setFieldCells(Cell.SHIP, coordinates[i][0], coordinates[i][1]);
        }
    }

    public static int[][] sortCoordinates(int[][] array) {
        int x = 0;
        int y = 0;
        int countI = 0;
        int countJ = 0;
        horizontal = false;
        vertical = false;
        boolean exit = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i][0] == array[i + 1][0]) {
                countI++;
            }
            if (array[i][1] == array[i + 1][1]) {
                countJ++;
            }
        }
        if (countI == array.length - 1)//если все координаты x одинаковые - корабль горизонтальный
            horizontal = true;
        if (countJ == array.length - 1) //если все координаты y одинаковые - корабль вертикальный
            vertical = true;

        if (horizontal) { //если корабль горизонтальный - сортировка по координатам y
            while (exit) {
                exit = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i][1] > array[i + 1][1]) {
                        exit = true;
                        x = array[i][1];
                        array[i][1] = array[i + 1][1];
                        array[i + 1][1] = x;
                    }
                }
            }
        }
        if (vertical) { //если корабль вертикальный - сортировка по поординатам x
            while (exit) {
                exit = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i][0] > array[i + 1][0]) {
                        exit = true;
                        x = array[i][0];
                        array[i][0] = array[i + 1][0];
                        array[i + 1][0] = x;
                    }
                }
            }
        }
        return array;
    }

    public static void oreolCheck(Field field, int[][] array) {//проверка не попадают ли координаты в поле другого корабля
        for (int i = 0; i < array.length; i++) {
            if (field.getFieldCells()[array[i][0]][array[i][1]] == Cell.HALO || field.getFieldCells()[array[i][0]][array[i][1]] == Cell.SHIP) {
                oreolCheck = true;
                break;
            } else oreolCheck = false;
        }
    }

}
