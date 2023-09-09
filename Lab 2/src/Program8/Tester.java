package Program8;

public class Tester {
    public static void main(String[] args) {
        String[] strings = {"The", "quick", "brown", "fox", "jumps",
                "over", "the", "lazy", "dog"};
        for (int i = 0; i < strings.length; ++i) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();

        String[] reversedStrings = Reverser.reverseStrings(strings);
        for (int i = 0; i < strings.length; ++i) {
            System.out.print(reversedStrings[i] + " ");
        }
    }
}
