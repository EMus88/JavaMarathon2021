package day11.task2;

public abstract class Hero {
    public static final int MAX_HEALTH = 100;
    public static final int MIN_HEALTH=0;
    private int health; //здоровье
    private int physDef; //процент поглощения физического урона
    private int magicDef; //процент поглощения магического урона
    private int physAtt; //величина физической атаки
    private int magicAtt; // величина магической атаки

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

}
