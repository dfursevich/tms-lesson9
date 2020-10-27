import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Dzmitry Fursevich
 */
public class RunStudentSort {
    public static void main(String[] args) {
        Student alex = new Student("Alex", 20);
        Student alex10 = new Student("Alex", 10);
        Student anna = new Student("Anna", 21);
        Student tom = new Student("Tom", 13);

        List<Student> students = new ArrayList<>();
        students.add(anna);
        students.add(tom);
        students.add(alex);
        students.add(alex10);

        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

        StudentSortByAge sort = new StudentSortByAge();
        Collections.sort(students, sort);

        System.out.println(students);
    }
}
