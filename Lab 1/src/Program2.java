public class Program2 {
    public static void run() {
        System.out.println("\nProgram 2");

        System.out.print("Enter array size: ");
        int N = Main.scanner.nextInt();
        double[] arr = new double[N];

        System.out.print("Enter array (" + N + "): ");
        int i = 0;
        while (i < N) {
            arr[i++] = Main.scanner.nextDouble();
        }

        i = 0;
        double sum = 0;
        do {
            sum += arr[i++];
        } while (i < N);
        System.out.println("Sum = " + sum);

        double min = arr[0], max = arr[0];
        i = 0;
        while (i < N) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i++], max);
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
