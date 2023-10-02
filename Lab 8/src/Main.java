public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 7");
        System.out.println("Простые делители числа 210: ");
        int[] primeDivisors = getPrimeDivisors(210);
        for (int divisor : primeDivisors) {
            System.out.print(divisor + " ");
        }

        System.out.println("\n\nЗадание 8");
        String str = "Лёша на полке клопа нашёл";
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println("Строка: \"" + str + "\" - палиндром");
        }
        else {
            System.out.println("Строка: \"" + str + "\" - не палиндром");
        }
        str = "Лёша на полке муравья нашёл";
        isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println("Строка: \"" + str + "\" - палиндром");
        }
        else {
            System.out.println("Строка: \"" + str + "\" - не палиндром");
        }

        System.out.println("\nЗадание 9");
        System.out.println("Из 4 нулей и 4 единиц можно составить: " + getSequencesCount(4, 4, -1) + " последовательностей");
        /*
        1 0 1 0 1 0 1 0
        0 1 1 0 1 0 1 0
        0 1 0 1 1 0 1 0
        0 1 0 1 0 1 1 0
        0 1 0 1 0 1 0 1
         */

        System.out.println("\nЗадание 10");
        System.out.print("15924 ~ ");
        printReversed(15924);
        System.out.print("\n52 ~ ");
        printReversed(52);
        System.out.print("\n1 ~ ");
        printReversed(1);
    }

    public static int[] getPrimeDivisors(int x) {
        boolean[] isPrime = new boolean[x + 1];
        for (int i = 0; i < isPrime.length; ++i) {
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i < isPrime.length; ++i) {
            if (isPrime[i])
                for (int j = i * 2; j < isPrime.length; j += i)
                    isPrime[j] = false;
        }

        int primeDivisorsCount = 0;
        for (int i = 2; i < isPrime.length; ++i) {
            if (x % i == 0 && isPrime[i])
                ++primeDivisorsCount;
        }

        int[] primeDivisors = new int[primeDivisorsCount];
        int k = 0;
        for (int i = 2; i < isPrime.length; ++i) {
            if (x % i == 0 && isPrime[i])
                primeDivisors[k++] = i;
        }
        return primeDivisors;
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");
        return palindromeRecurse(str, 0, str.length() - 1);
    }

    public static boolean palindromeRecurse(String str, int l, int r) {
        if (l >= r)
            return true;
        if (str.charAt(l) != str.charAt(r))
            return false;
        return palindromeRecurse(str, l + 1, r - 1);
    }

    public static int getSequencesCount(int a, int b, int prev) {
        if (a < 0 || b < 0)
            return 0;
        if (a == 0 && b == 0)
            return 1;

        int s = 0;
        if (prev == 0) {
            s += getSequencesCount(a, b - 1, 1);
        }
        else {
            s += getSequencesCount(a - 1, b, 0);
            s += getSequencesCount(a, b - 1, 1);
        }
        return s;
    }

    public static void printReversed(int x) {
        if (x == 0)
            return;
        System.out.print(x % 10);
        printReversed(x / 10);
    }
}