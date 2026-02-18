import java.util.HashMap;

public class StringCount {
    public static void main(String[] args) {

        String[] arr = {"apple", "banana", "Orange", "apple", "Pineapple", "banana", "apple"};
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);
    }
}
