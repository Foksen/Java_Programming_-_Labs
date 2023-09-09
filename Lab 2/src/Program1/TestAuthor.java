package Program1;

import java.util.Scanner;

public class TestAuthor {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name, email;
        char gender;

        System.out.print("Enter author name: ");
        name = scanner.next();

        System.out.print("Enter author email: ");
        email = scanner.next();

        System.out.print("Enter author gender (m/f): ");
        gender = scanner.next().charAt(0);

        Author author = new Author(name, email, gender);
        System.out.println("Program1.Author was created: " + author.toString());

        System.out.print("Enter new author email: ");
        email = scanner.next();

        System.out.println("New email was set: " + author.toString());
    }
}
