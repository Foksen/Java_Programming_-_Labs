package Task5;

import java.util.Scanner;

public class Tester {
    public static String input;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        CommandHistory commandHistory = new CommandHistory();

        while (true) {
            System.out.println("Текущая строка: " + stringBuilder.getString());
            System.out.println("1. Добавить подстроку");
            System.out.println("2. Отменить последнее действие");
            int operation = 0;
            System.out.print("Ваш выбор: ");
            operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.print("Введите подстроку: ");
                    input = scanner.next();
                    CommandAppend commandAppend = new CommandAppend(stringBuilder);
                    commandAppend.execute();
                    commandHistory.push(commandAppend);
                    break;
                case 2:
                    Command command = commandHistory.pop();
                    if (command != null) {
                        command.undo();
                    }
                    break;
            }
        }
    }
}
