package day12.task5;

import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private List<MusicArtist> members;

    public String toString() {
        return "MusicBand " +
                "name= " + name + '\'' +
                ", year= " + year +
                ' ';
    }

    public int getYear() {
        return year;
    }


    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public static void transferMembers(MusicBand band, MusicBand musicBand2){
        for (MusicArtist members: band.getMembers()){
            musicBand2.getMembers().add(members);

        }
        band.getMembers().clear();
    }

    public void printInfo(){
        System.out.println(this.members);
    }

}
