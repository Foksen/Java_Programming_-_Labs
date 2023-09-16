package Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.random;

public class Task1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        program1();
        program3();
        program4();
    }

    private static void program1() {
        System.out.println("Упражнение 1.");
        double[] arr = new double[10];
        for (int i = 0; i < 10; ++i) {
            if (i % 2 == 0) {
                arr[i] = random() * 10;
            } else {
                arr[i] = (new Random()).nextDouble(10.);
            }
        }
        System.out.println("Созданный массив: ");
        for (double i : arr) {
            System.out.printf("%.3f ", i);
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: ");
        for (double i : arr) {
            System.out.printf("%.3f ", i);
        }
        System.out.println();
    }

    private static void program3() {
        System.out.println("\nУпражнение 3.");
        int[] arr = new int[4];
        int prev = -1;
        boolean isIncreasing = true;
        for (int i = 0; i < 4; ++i) {
            arr[i] = ThreadLocalRandom.current().nextInt(10, 100);
            if (arr[i] < prev) {
                isIncreasing = false;
            }
            prev = arr[i];
        }
        System.out.println("Созданный массив: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nМассив " + (isIncreasing ? "" : "не ") + "возрастает");
    }

    private static void program4() {
        System.out.println("\nУпражнение 4.");
        int N = 0;
        while (true) {
            System.out.print("Введите размер массива: ");
            N = scanner.nextInt();
            if (N > 1)
                break;
            System.out.println("Недопустимый ввод! Повторите попытку!");
        }

        int[] arr = new int[N];
        int evenCounter = 0;
        for (int i = 0; i < N; ++i) {
            arr[i] = ThreadLocalRandom.current().nextInt(0, N + 1);
            if (arr[i] % 2 == 0) {
                ++evenCounter;
            }
        }
        int[] arr2 = new int[evenCounter];
        int j = 0;
        for (int i = 0; i < N; ++i) {
            if (arr[i] % 2 == 0) {
                arr2[j++] = arr[i];
            }
        }
        System.out.println("Созданный массив: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nМассив из чётных элементов: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
