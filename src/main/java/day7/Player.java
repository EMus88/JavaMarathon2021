package day7;

import java.lang.invoke.SwitchPoint;

public class Player {
    int stamina;
    static int countPlayers = 0;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    static String lang;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers >= 6) {
            countPlayers = 6;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getcountPlayers() {
        return countPlayers;
    }

    void run() {
        this.stamina -= 1;
    }


    public static void info() {
        switch (6-countPlayers) {
            case 1:
                lang = "свободное место";
                break;
            case 2:
            case 3:
            case 4:
                lang = "свободных места";
                break;
            case 5:
                lang = "свободных мест";
                break;

        }
        if (countPlayers >= 6) {
            System.out.println("На поле нет свободных мест");
        } else
            System.out.println("Команды неполные. На поле есть " + (6 - countPlayers) + " " + lang);
    }

}
