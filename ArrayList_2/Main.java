import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Hank", 20));
        students.add(new Student("Alice", 20));
        students.add(new Student("Charlie", 19));
        students.add(new Student("Eve", 23));
        students.add(new Student("Jack", 22));
        students.add(new Student("David", 22));
        students.add(new Student("Grace", 24));
        students.add(new Student("Frank", 18));
        students.add(new Student("Ivy", 21));
        students.add(new Student("Bob", 21));
        System.out.println("Students: " + students);

        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Students: " + students);

    }
}
