package day6;

public class Task3 {
    public static void main(String[] args) {
    Teacher teacher = new Teacher("Валентина Степановна", "Математика");
            Student student1 = new Student("Антон Дмитрыч", "Биология");

            teacher.evaluate(student1);
    }
}
