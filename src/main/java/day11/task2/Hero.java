package day11.task2;

public abstract class Hero implements PhysAttack {
    public double health;
    public double physDef;
    public double magDef;
    public int physAtt;
    public int magAtt;

    public Hero() {
        health = 100;
    }


    public void physicalAttack(Hero hero) {
        double attackScore = physAtt * (1 - physDef);
        if (hero.health + attackScore < 0) {
            hero.health = 0;
        }
        else
            hero.health -= attackScore;
    }


}
