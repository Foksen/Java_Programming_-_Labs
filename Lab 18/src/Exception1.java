public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
