package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player messi = new Player(rand.nextInt(10) + 90);
        Player pele = new Player(rand.nextInt(10) + 90);
        Player ronaldo = new Player(rand.nextInt(10) + 90);
        Player kokorin = new Player(rand.nextInt(10) + 90);
        Player mamaev = new Player(rand.nextInt(10) + 90);
        Player arshavin = new Player(rand.nextInt(10)+90);
        // Player zidan = new Player(rand.nextInt(10)+90);

        Player.info();

        while (kokorin.stamina > 0) {
            kokorin.run();
        }
        if (kokorin.stamina == 0) {
            Player.countPlayers -= 1;
        }
        Player.info();

    }
}
