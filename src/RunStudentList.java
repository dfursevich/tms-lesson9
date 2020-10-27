import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Dzmitry Fursevich
 */
public class RunStudentList {
    public static void main(String[] args) {
        Student alex = new Student("Alex", 20);
        Student anna = new Student("Anna", 21);
        Student tom = new Student("Tom", 22);

        List<Student> students = new ArrayList<>();
        students.add(anna);
        students.add(alex);
        students.add(tom);

        System.out.println(students);

        boolean containsTom = students.contains(tom);
        System.out.println("containsTom = " + containsTom);

        Student tom2 = new Student("Tom", 22);

        boolean containsTom2 = students.contains(tom2);
        System.out.println("containsTom2 = " + containsTom2);

        if (tom.equals(tom2)) {
            System.out.println("Toms equals");
        }

        students.remove(tom2);
        System.out.println(students);

        Collections.sort(students);
    }
}
