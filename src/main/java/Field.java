import java.util.Scanner;

public class Field {
    private Cell[][] fieldCells = new Cell[10][10]; //игровое поле - массив из ячеек (корабль,ореал, пустое место и т.д)
    private final int MAXCAOUNTHIT = 20;
    private int counthit;
    private String name;

    public String getName() {
        return name;
    }

    public int getMAXCAOUNTHIT() {
        return MAXCAOUNTHIT;
    }

    public int getCounthit() {
        return counthit;
    }

    public void setCounthit(int counthit) {
        this.counthit = counthit;
    }

    public Cell[][] getFieldCells() {
        return fieldCells;
    }

    public Field(String name) { //при создании объекта класса (новое игровое поле) инициализируется игровое поле из пустых ячеек
        for (int i = 0; i < fieldCells.length; i++) {
            for (int j = 0; j < fieldCells.length; j++) {
                fieldCells[i][j] = Cell.FREECELL;
            }
        }
        this.name = name;
    }

    public void setFieldCells(Cell value, int i, int j) {//изменение значений ячеек игрового поля
        this.fieldCells[i][j] = value;
    }

    public static void createNewGame(Field player1, Field player2) { //создание нового игрового поля
        Ship[] ships = { //массив из единиц караблей для одного игрового поля
                Ship.FOURTHSHIP,
                Ship.TRIPLESHIP,
                Ship.TRIPLESHIP,
                Ship.DOUBLESHIP,
                Ship.DOUBLESHIP,
                Ship.DOUBLESHIP,
                Ship.SINGLESHIP,
                Ship.SINGLESHIP,
                Ship.SINGLESHIP,
                Ship.SINGLESHIP,
        };
        System.out.println("  ==========================================================");
        System.out.println("==================***МОРСКОЙ БОЙ***===========================");
        System.out.println("  ==========================================================");
        System.out.println("Создание игрового поля 1-го игрока(2-й игрок не должен видеть это поле)");
        for (Ship ship : ships) {
            Ship.addShipToField(player1, ship);
            Field.addOreol(player1);
        }
        System.out.println("Игровое поле первого игрока:");
        player1.printField();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите Enter");
        scanner.nextLine();
        for (int i = 0; i < 10; i++) System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println("Создание игрового поля 2-го игрока(1-й игрок не должен видеть это поле)");
        for (Ship ship : ships) {
            Ship.addShipToField(player2, ship);
            Field.addOreol(player2);
        }
        System.out.println("Игровое поле второго игрока:");
        player2.printField();
        System.out.println("Нажмите Enter");
        scanner.nextLine();
        for (int i = 0; i < 10; i++) System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Игровые поля созданы");
    }


    public static void addOreol(Field field) {
        for (int i = 0; i < field.fieldCells.length; i++) {
            for (int j = 0; j < field.fieldCells[0].length; j++) {
                if (field.fieldCells[i][j] == Cell.SHIP) {

                    if (i > 0 && field.fieldCells[i - 1][j] == Cell.FREECELL) {
                        field.fieldCells[i - 1][j] = Cell.HALO;
                    }
                    if (i > 0 && j < 9 && field.fieldCells[i - 1][j + 1] == Cell.FREECELL) {
                        field.fieldCells[i - 1][j + 1] = Cell.HALO;
                    }
                    if (j > 0 && field.fieldCells[i][j - 1] == Cell.FREECELL) {
                        field.fieldCells[i][j - 1] = Cell.HALO;
                    }
                    if (i < 9 && j > 0 && field.fieldCells[i + 1][j - 1] == Cell.FREECELL) {
                        field.fieldCells[i + 1][j - 1] = Cell.HALO;
                    }
                    if (i > 0 && j > 0 && field.fieldCells[i - 1][j - 1] == Cell.FREECELL) {
                        field.fieldCells[i - 1][j - 1] = Cell.HALO;
                    }
                    if (i < 9 && field.fieldCells[i + 1][j] == Cell.FREECELL) {
                        field.fieldCells[i + 1][j] = Cell.HALO;
                    }
                    if (j < 9 && field.fieldCells[i][j + 1] == Cell.FREECELL) {
                        field.fieldCells[i][j + 1] = Cell.HALO;
                    }
                    if (i < 9 && j < 9 && field.fieldCells[i + 1][j + 1] == Cell.FREECELL) {
                        field.fieldCells[i + 1][j + 1] = Cell.HALO;
                    }

                }
            }
        }
    }

    public void printField() { //вывод в консоль игрового поля
        for (int i = 0; i < fieldCells.length; i++) {
            for (int j = 0; j < fieldCells.length; j++) {
                System.out.printf("%4s", fieldCells[i][j].getSymbol());
            }
            System.out.println();
        }
    }
}