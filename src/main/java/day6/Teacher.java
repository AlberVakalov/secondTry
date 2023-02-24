package day6;

import java.util.Random;

public class Teacher {
    String name;
    String object;


    public Teacher(String name, String object){
        this.name = name;
        this.object=object;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getObject() {
        return object;
    }

    public void evaluate(Student student){
        Random random = new Random();
        int randomValue = random.nextInt(5) + 2;

        String pointValue = "";
        switch (randomValue){
            case 2: pointValue = "Неуд";
            break;

            case 3: pointValue = "удт";
            break;

            case 4: pointValue = "Хорошо";
            break;

            case  5: pointValue = "Отлично";
            break;

        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getNameStudent() +
                " по предмету " + student.getSubject() + " на оценку " + pointValue);

    }

}
