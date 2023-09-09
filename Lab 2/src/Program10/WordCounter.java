package Program10;

public class WordCounter {
    public static int countWord(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) == ' ')
                ++count;
        }
        return count + 1;
    }
}
