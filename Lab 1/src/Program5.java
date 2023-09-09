public class Program5 {
    public static void run() {
        System.out.println("\nProgram 5");
        int x = 0;
        System.out.print("Enter number: ");
        x = Main.scanner.nextInt();

        System.out.println(x + "! = " + factorial(x));
    }

    public static int factorial(int x) {
        int res = 1;
        for (int i = 2; i <= x; ++i) {
            res *= i;
        }
        return res;
    }
}
