package day14;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        File file = new File("C:\\Users\\Alik\\IdeaProjects\\secondTry\\src\\main\\java\\day14\\Peiokes");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        file = new File("C:\\Users\\Alik\\IdeaProjects\\secondTry\\src\\main\\java\\day14\\Peiokes");
        List<Person> peoples = new ArrayList<>();

        try{
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] all = line.split(" ");
                if (Integer.parseInt(all[1]) < 0){
                    throw new RuntimeException();
                }

                Person rightPerson = new Person(Integer.parseInt(all[1]) , all[0]);
                peoples.add(rightPerson);
            } return peoples;

        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (RuntimeException e){
            System.out.println("Неккоректный входной файл");
        }
        return null;
    }
}

