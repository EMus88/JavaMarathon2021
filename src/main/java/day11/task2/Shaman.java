package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttac {
    private int addHealth = 50;
    private int addHealthHero = 30;

    public Shaman() {
        super.setHealth(100);
        super.setPhysAtt(10);
        super.setMagicAtt(15);
        super.setPhysDef(20);
        super.setMagicDef(20);
    }

    @Override
    public void healHimself() {
        if ((super.getHealth() + addHealth) > MAX_HEALTH) {
            super.setHealth(super.getHealth() + (MAX_HEALTH - super.getHealth()));
        } else {
            super.setHealth(super.getHealth() + addHealth);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if ((hero.getHealth() + addHealthHero) > MAX_HEALTH) {
            hero.setHealth(hero.getHealth() + (MAX_HEALTH - hero.getHealth()));
        } else {
            hero.setHealth(hero.getHealth() + addHealthHero);
        }
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
