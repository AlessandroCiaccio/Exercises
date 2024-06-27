import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pietro", 15);
        Student student2 = new Student("Luca", 14);
        Student student3 = new Student("Santina", 17);
        Student student4 = new Student("Beatrice", 18);
        List<Student> students = new ArrayList<>();
        System.out.println("Students: " + students);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.println("Students: " + students);
    }
}
