import java.util.*;

public class StringDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split(" ");
        ArrayList<String> uniq = new ArrayList<>();

        for (String word : words) {
            if (!uniq.contains(word)) {
                uniq.add(word);
            }
        }
        String result = String.join(" ", uniq);
        System.out.println("Without duplicate words:");
        System.out.println(result);
    }
}

