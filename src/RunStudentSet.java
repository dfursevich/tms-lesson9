import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dzmitry Fursevich
 */
public class RunStudentSet {
    public static void main(String[] args) {
        Student alex = new Student("Alex", 20);
        Student anna = new Student("Anna", 21);
        Student tom = new Student("Tom", 22);

        Set<Student> students = new HashSet<>();
        students.add(anna);
        students.add(alex);
        students.add(tom);

        System.out.println(students);

        Student tom2 = new Student("Tom", 22);
        boolean containsTom2 = students.contains(tom2);
        System.out.println("containsTom2 = " + containsTom2);

        System.out.println("tom.hashCode() = " + tom.hashCode());
        System.out.println("tom2.hashCode() = " + tom2.hashCode());
    }
}
