import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Dzmitry Fursevich
 */
public class RunList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
        list.add("s1");
        list.add("s2");
        list.add("s2");
        System.out.println(list);
        list.add(1, "s12");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        boolean containsS2 = list.contains("s2");
        System.out.println("containsS2 = " + containsS2);
        boolean containsS3 = list.contains("s3");
        System.out.println("containsS3 = " + containsS3);

        list.remove("s2");
        System.out.println(list);

        List<String> subList = new ArrayList<>();
        subList.add("sub-s2");
        subList.add("sub-s1");
        list.addAll(subList);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }
}
