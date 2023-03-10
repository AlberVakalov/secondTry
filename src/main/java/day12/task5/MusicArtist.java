package day12.task5;

import java.util.List;

public class MusicArtist {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "MusicArtist " +
                "age= " + age +
                ", name= " + name;
    }

    public MusicArtist(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
