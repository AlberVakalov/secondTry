package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand("Аффинаж", 2007);
        MusicBand musicBand1 = new MusicBand("Retuses", 2001);
        MusicBand musicBand2 = new MusicBand("Звуки му", 1983);
        MusicBand musicBand3 = new MusicBand("Beatles", 1963);
        MusicBand musicBand4 = new MusicBand("Skrillex", 2001);

        List<MusicBand> musicList = new ArrayList<>();
        musicList.add(musicBand);
        musicList.add(musicBand1);
        musicList.add(musicBand2);
        musicList.add(musicBand3);
        musicList.add(musicBand4);

        System.out.println(musicList);

        Collections.shuffle(musicList);

        List<MusicBand> filteredList = new ArrayList<>();

        for (MusicBand band : musicList) {
            if (band.getYear() > 2000) {
                filteredList.add(band);
            }
        }
        System.out.println(filteredList);
    }
}
