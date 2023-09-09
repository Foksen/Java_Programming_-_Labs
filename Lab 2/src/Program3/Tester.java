package Program3;

import java.util.Scanner;

public class Tester {
    private static Circle[] circles;
    private static int count;
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter circle count: ");
        count = scanner.nextInt();
        circles = new Circle[count];

        for (int i = 0; i < count; ++i) {
            double x, y, radius;
            System.out.print("Enter x: ");
            x = scanner.nextDouble();

            System.out.print("Enter y: ");
            y = scanner.nextDouble();

            System.out.print("Enter radius: ");
            radius = scanner.nextDouble();

            circles[i] = new Circle(new Point(x, y), radius);
        }

        for (int i = 0; i < count; ++i) {
            System.out.println("Circle " + (i + 1) + ": " + circles[i].toString());
        }
    }
}
