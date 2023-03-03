package day11.task2;

public class Paladin extends Hero implements Healer {

    static final double HEAL = 25;
    static final double HEAL_TEAMMATE = 20;

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + HEAL > 100) {
            health = 100;
            System.out.println("Здоровье 100");
        } else {
            health += 25;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE > 100) {
            hero.health = 100;
            System.out.println("Здоровье героя 100");
        } else {
            health += 25;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
