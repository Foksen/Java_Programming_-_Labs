package Task2;

public class StrangeCalculator {
    public static <N1 extends Number, N2 extends Number> void sum(N1 a, N2 b)  {
        Double res = a.doubleValue() + b.doubleValue();
        System.out.println(res);
    }

    public static <N1 extends Number, N2 extends Number> void subtraction(N1 a, N2 b)  {
        Double res = a.doubleValue() - b.doubleValue();
        System.out.println(res);
    }

    public static <N1 extends Number, N2 extends Number> void multiply(N1 a, N2 b)  {
        Double res = a.doubleValue() * b.doubleValue();
        System.out.println(res);
    }

    public static <N1 extends Number, N2 extends Number> void divide(N1 a, N2 b)  {
        Double res = a.doubleValue() / b.doubleValue();
        System.out.println(res);
    }
}
