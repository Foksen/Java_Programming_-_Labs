package Task6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[a-zA-Z\\-_0-9]+@[a-zA-Z]+\\.[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);

        String input = "";
        while (!input.equals("stop")) {
            System.out.print("Input: ");
            input = scanner.next();
            Matcher matcher = pattern.matcher(input);
            matcher.useAnchoringBounds(true);

            boolean isCorrect = true;
            if (!matcher.matches()) {
                isCorrect = false;
            }

            if (isCorrect)
                System.out.println("Correct");
            else
                System.out.println("Incorrect");
        }
    }
}
