import java.util.Scanner;

public class Program1 {
    public static void run() {
        System.out.println("\nProgram 1");

        System.out.print("Enter array size: ");
        int N = Main.scanner.nextInt();
        double[] arr = new double[N];

        System.out.print("Enter array (" + N + "): ");
        for (int i = 0; i < N; ++i) {
            arr[i] = Main.scanner.nextDouble();
        }

        double sum = 0;
        for (double elem : arr) {
            sum += elem;
        }
        System.out.println("Sum = " + sum);

        double medium = sum / N;
        System.out.println("Medium = " + medium);
    }
}
