package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List <MusicArtist> musicArtists = new ArrayList<>();
        musicArtists.add(new MusicArtist(20, "Энди Хачатурян"));
        musicArtists.add(new MusicArtist(26, "Джон Долмаян"));
        musicArtists.add(new MusicArtist(24, "Дарон Малакян"));
        musicArtists.add(new MusicArtist(29, "Серж Танкян"));
        MusicBand soad = new MusicBand("SOAD", 2003, musicArtists);

        List <MusicArtist> musicArtists2 = new ArrayList<>();
        musicArtists2.add(new MusicArtist(20, "Кевин Халланд"));
        musicArtists2.add(new MusicArtist(20, "Джонатан Салас"));
        musicArtists2.add(new MusicArtist(20, "Джон Купер"));
        MusicBand skillet = new MusicBand("Skillet", 2005, musicArtists2);

        soad.printInfo();
        skillet.printInfo();

        MusicBand.transferMembers(soad, skillet);

        skillet.printInfo();
    }
}
