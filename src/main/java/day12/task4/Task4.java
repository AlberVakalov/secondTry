package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> member = new ArrayList<>();
        member.add("Со́нни Джон Мур");
        member.add("Anton");
        MusicBand skrillex = new MusicBand("Skrillex", 2001, member);

        ArrayList<String> member2 = new ArrayList<>();
        member2.add("Кристовский Сергеей");
        member2.add("Кристовский Владимир");

        MusicBand uma2rman = new MusicBand("uma2rman", 2003, member2);
        skrillex.printInfo();
        uma2rman.printInfo();

        MusicBand.transferMembers(skrillex, uma2rman);

        uma2rman.printInfo();
    }
}
