package day11.task2;

public class Magician extends Hero implements MagicAttack{
    public Magician() {
        physAtt = 5;
        magAtt = 20;
        physDef = 0;
        magDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magAtt - (magAtt * magDef);
        if (hero.health + attackScore < 0) {
            hero.health = 0;
        }
        else
            hero.health -= attackScore;

    }
}
