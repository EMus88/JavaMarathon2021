package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttac {

    public Magician() {
        super.setHealth(100);
        super.setPhysAtt(5);
        super.setMagicAtt(20);
        super.setPhysDef(0);
        super.setMagicDef(80);
    }

    @Override
    public void magicalAttack(Hero hero) {
        if ((hero.getHealth() - getMagicAtt() * (100 - hero.getMagicDef()) / 100) < MIN_HEALTH) {
            hero.setHealth(0);
        }
        else{
            hero.setHealth(hero.getHealth() - getMagicAtt() * (100 - hero.getMagicDef()) / 100);
        }
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
