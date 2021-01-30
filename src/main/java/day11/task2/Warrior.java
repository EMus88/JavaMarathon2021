package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super.setHealth(100);
        super.setPhysAtt(30);
        super.setPhysDef(80);
        super.setMagicDef(0);
    }

    @Override
    public void physicalAttack(Hero hero) {
        if ((hero.getHealth() - getPhysAtt() * (100 - hero.getPhysDef()) / 100) < MIN_HEALTH) {
            hero.setHealth(0);
        }
        else {
            hero.setHealth(hero.getHealth() - getPhysAtt() * (100 - hero.getPhysDef()) / 100);
        }
    }
    public String toString() {
        return "Здоровье " + getHealth() + " физ. атака " + getPhysAtt() + " физ. защита " +getPhysDef() + " маг. защита " +  getMagicAtt();
    }
}

