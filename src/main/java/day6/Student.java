package day6;

public class Student {
    String nameStudent;
    String subject;



    public Student(String nameStudent, String subject)
    {
        this.subject = subject;
        this.nameStudent = nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }


    public String getSubject() {
        return subject;
    }
}
