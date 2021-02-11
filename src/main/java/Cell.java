public enum Cell {
    SHIP(" \uD83D\uDEE5"),       //корабль
    FREECELL("⬜"),              //пустая ячейка
    HALO("\uD83D\uDFE6"),       //ореол вокруг корабля
    DEADPART("\uD83D\uDFE5");   //"убитая" ячейка

    private final String SYMBOL;


    public String getSymbol() {
        return SYMBOL;
    }

    Cell(String symbol) {
        this.SYMBOL = symbol;

    }
}


