package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Albert", "Kalasg");
        Teacher teacher = new Teacher("Fedos", "Math");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
