package day9.Task1;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Это человек с именем " + name);

    }
}
