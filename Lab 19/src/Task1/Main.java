package Task1;

import Task1.BadInnException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean go = true;
        while (go) {
            try {
                System.out.print("Введите ИНН (12 цифр): ");
                String inn = scanner.next();
                if (!checkInn(inn))
                    throw new BadInnException("ИНН \"" + inn + "\" неверный");
                go = false;
            } catch (BadInnException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Unknown error");
            }
        }

    }

    public static boolean checkInn(String strInn) {
        Pattern pattern = Pattern.compile("^\\d{12}$");
        Matcher matcher = pattern.matcher(strInn);
        return matcher.matches();
    }
}