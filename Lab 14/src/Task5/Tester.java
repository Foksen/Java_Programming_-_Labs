package Task5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\w\\w/\\w\\w/\\w\\w\\w\\w";
        Pattern pattern = Pattern.compile(regex);

        String input = "";
        while (!input.equals("stop")) {
            System.out.print("Input: ");
            input = scanner.next();
            Matcher matcher = pattern.matcher(input);

            boolean isCorrect = true;
            if (!matcher.matches()) {
                isCorrect = false;
            }
            else {
                try {
                    String res = matcher.group();
                    String[] dateNumbers = res.split("/");
                    int d = Integer.parseInt(dateNumbers[0]);
                    int m = Integer.parseInt(dateNumbers[1]);
                    int y = Integer.parseInt(dateNumbers[2]);
                    if (y < 1900 || y > 9999)
                        throw null;

                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    format.setLenient(false);
                    format.parse(res);
                }
                catch (Exception e) {
                    isCorrect = false;
                }

            }

            if (isCorrect)
                System.out.println("Correct");
            else
                System.out.println("Incorrect");
        }
    }
}
