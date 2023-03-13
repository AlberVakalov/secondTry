package day12.task3;

import java.util.List;

public class MusicBand {
    private final String name;
    int year;


    @Override
    public String toString() {
        return "MusicBand " +
                "name= " + name + '\'' +
                ", year= " + year +
                ' ';
    }

    public int getYear() {
        return year;
    }


    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }
}
