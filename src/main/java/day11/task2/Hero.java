package day11.task2;

public abstract class Hero implements PhysAttack {
    protected double health;
    protected double physDef;
    protected double magDef;
    protected int physAtt;
    protected int magAtt;

    public Hero() {
        health = 100;
    }


    public void physicalAttack(Hero hero) {
        double attackScore = physAtt - (physAtt * physDef);
        if (hero.health + attackScore < 0) {
            hero.health = 0;
        }
        else
            hero.health -= attackScore;
    }


}
