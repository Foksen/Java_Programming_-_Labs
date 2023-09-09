package Program2;

import java.util.Scanner;

public class TestBall {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double x = 0.0, y = 0.0;

        System.out.print("Enter x: ");
        try {
            x = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.print("Enter y: ");
        y = scanner.nextDouble();

        Ball ball = new Ball(x, y);
        System.out.println("Ball was created: " + ball.toString());

        System.out.print("Enter new x: ");
        x = scanner.nextDouble();

        System.out.print("Enter new y: ");
        y = scanner.nextDouble();

        ball.setXY(x, y);
        System.out.println("New coords: " + ball.toString());

        System.out.print("Enter delta x: ");
        x = scanner.nextDouble();

        System.out.print("Enter delta y: ");
        y = scanner.nextDouble();

        ball.move(x, y);
        System.out.println("Ball was moved: " + ball.toString());
    }
}
