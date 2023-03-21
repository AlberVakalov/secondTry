package day9.Task1;

public class Student extends Person{
    private final String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public void printInfo(){
        System.out.println("Это человек с именем " + getName());
        System.out.println("Это студент с именем " + getName());
    }
}
