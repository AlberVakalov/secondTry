package day12.task4;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MusicBand {
    private final String name;
    int year;
    private List<String> members;

    public String toString() {
        return "MusicBand " +
                "name= " + name + '\'' +
                ", year= " + year +
                ' ';
    }

    public int getYear() {
        return year;
    }


    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public static void transferMembers(MusicBand band, MusicBand musicBand2){
        for (String members: band.getMembers()){
            musicBand2.getMembers().add(members);

        }
        band.getMembers().clear();
    }

    public void printInfo(){
        System.out.println(this.members);
    }

}
