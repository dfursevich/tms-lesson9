/**
 * @author Dzmitry Fursevich
 */
public class RunBox {
    public static void main(String[] args) {
        Box<String, String> box = new Box<String, String>("hello", "world");
        Box<Integer, Double> box2 = new Box<Integer, Double>(1, 1d);
    }
}
