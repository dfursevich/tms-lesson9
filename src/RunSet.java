import java.util.HashSet;
import java.util.Set;

/**
 * @author Dzmitry Fursevich
 */
public class RunSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("s1");
        set.add("s2");
        set.add("s3");
        set.add("s3");
        System.out.println(set);

        boolean containsS3 = set.contains("s3");
        System.out.println("containsS3 = " + containsS3);

        set.remove("s3");
        System.out.println(set);

        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
