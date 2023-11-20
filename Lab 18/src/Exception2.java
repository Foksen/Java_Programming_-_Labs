import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            String intString = scanner.next();
            int x = Integer.parseInt(intString);
            System.out.printf("%.3f\n", (2. / x));
        }
        catch (NumberFormatException e) {
            System.out.println("Not a number");
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        catch (Exception e) {
            System.out.println("Unknown exception");
        }
        finally {
            System.out.println("A number was parsed");
        }
    }
}
