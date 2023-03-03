package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    static final double HEALTH_HIMSELF = 50;
    static final double HEALTH_TEAMMATE = 30;

    public Shaman() {
        physAtt = 10;
        magAtt = 15;
        magDef = 0.2;
        physDef = 0.2;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        if (health + HEALTH_HIMSELF > 100) {
            health = 100;
        } else {
            health += HEALTH_HIMSELF;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEALTH_TEAMMATE > 100) {
            health = 100;
        } else {
            hero.health += HEALTH_TEAMMATE;
        }

    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magAtt * (1 - magDef);
        if (hero.health + attackScore < 0) {
            hero.health = 0;
        }
        else
            hero.health -= attackScore;
    }
}
