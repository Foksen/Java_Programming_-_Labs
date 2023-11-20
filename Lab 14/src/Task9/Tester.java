package Task9;
import java.util.Map;
import java.util.TreeMap;

public class Tester {
    public static void main(String[] args) {
        String text = "Константин Константинопольский поехал в Константинополь";
        String[] words = text.split(" ");

        Map<Character, Integer> dict = new TreeMap<>();
        for (String word : words) {
            char[] letters = word.toCharArray();
            for (char letter : letters) {
                if (!dict.containsKey(letter))
                    dict.put(letter, 0);
                dict.put(letter, dict.get(letter) + 1);
            }
        }

        dict.forEach((letter, count) -> {
            System.out.println(letter + ": " + count);
        });
    }
}
