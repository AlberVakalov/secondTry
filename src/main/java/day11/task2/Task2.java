package day11.task2;

public class Task2 {
    public static void main(String[] args) {
    Warrior warrior = new Warrior();
    Magician magician = new Magician();
    Paladin paladin = new Paladin();
    Shaman shaman = new Shaman();

    warrior.physicalAttack(paladin);
        System.out.println(paladin);
    paladin.physicalAttack(magician);
        System.out.println(magician);
    shaman.healTeammate(magician);
        System.out.println(magician);
    magician.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);

    }
}
