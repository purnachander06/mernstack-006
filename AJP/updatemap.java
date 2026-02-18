import java.util.HashMap;

public class UpdateMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Purna");
        map.put(2, "anrup");

        System.out.println("Original map:");
        System.out.println(map);

        map.put(2, "Apple");

        System.out.println("Updated map:");
        System.out.println(map);
    }
}
