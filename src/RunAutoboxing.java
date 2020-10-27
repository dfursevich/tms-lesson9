/**
 * @author Dzmitry Fursevich
 */
public class RunAutoboxing {
    public static void main(String[] args) {
        int i = 10;
        Integer ii = i;
        //Integer ii = Integer.valueOf(i);
        int iii = ii;
        //int iii = ii.intValue();

        Integer intNull = null;
        int i1 = intNull;
    }
}
