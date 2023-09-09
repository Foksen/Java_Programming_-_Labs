package Program10;

import java.util.Scanner;

public class Tester {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String phrase;
        System.out.print("Enter phrase: ");
        phrase = scanner.nextLine();
        System.out.println(WordCounter.countWord(phrase) + " words");
    }
}
