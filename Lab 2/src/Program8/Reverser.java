package Program8;

public class Reverser {
    public static String[] reverseStrings(String[] strings) {
        String[] reversedStrings = strings.clone();
        for (int i = 0; i < reversedStrings.length / 2 - 1; ++i) {
            int j = reversedStrings.length - i - 1;
            String temp = reversedStrings[i];
            reversedStrings[i] = reversedStrings[j];
            reversedStrings[j] = temp;
        }
        return reversedStrings;
    }
}
