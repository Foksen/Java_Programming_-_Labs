import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя разработчика: ");
        String developerName = scanner.next();

        String input = "";
        do {
            System.out.print("Введите start, чтобы начать работу: ");
            input = scanner.next();
        } while (!Objects.equals(input, "start"));
        Date dateStart = new Date();

        do {
            System.out.print("Введите end, чтобы завершить работу: ");
            input = scanner.next();
        } while (!Objects.equals(input, "end"));
        Date dateEnd = new Date();

        System.out.println("Время работы: " + (dateEnd.getTime() - dateStart.getTime()) / 1000. + " с");
    }
}
