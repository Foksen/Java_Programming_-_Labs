public class Main {
    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo();

        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();


        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.printMessage(null);
        throwsDemo.printMessage("");
        throwsDemo.printMessage("abcd");
    }
}
