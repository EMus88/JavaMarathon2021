package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        System.out.println(warrior.toString());
        System.out.println(paladin.toString());
        System.out.println(magician.toString());
        System.out.println(shaman.toString());

        warrior.physicalAttack(paladin); //Воин атакует Паладина
        System.out.println(paladin.getHealth());
        paladin.physicalAttack(magician); //Паладин атакует Мага
        System.out.println(magician.getHealth());
        shaman.healTeammate(magician);// Шаман лечит Мага
        System.out.println(magician.getHealth());
        magician.magicalAttack(paladin);// Маг атакует Паладина, тип атаки М
        System.out.println(paladin.getHealth());
        shaman.physicalAttack(warrior);// Шаман атакует Воина, тип атаки Ф
        System.out.println(warrior.getHealth());
        paladin.healHimself();// Паладин лечит себя
        System.out.println(paladin.getHealth());
        for (int i = 1; i <= 5; i++) {// Воин атакует Мага 5 раз
            warrior.physicalAttack(magician);
            System.out.println(magician.getHealth());
        }




    }


}

