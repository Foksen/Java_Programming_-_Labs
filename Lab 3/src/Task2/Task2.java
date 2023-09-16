package Task2;

public class Task2 {
    public static void main(String[] args) {
        program1();
    }

    private static void program1() {
        System.out.println("Упражнение 1");

        Double a = Double.valueOf(0.2);
        System.out.println(a);

        Double b = Double.parseDouble("0.4");
        System.out.println(b);

        Double d = 42.42;

        byte byteVar = d.byteValue();
        double doubleVar = d.doubleValue();
        float floatVar = d.floatValue();
        int intVar = d.intValue();
        long longVar = d.longValue();
        short shortVar = d.shortValue();

        System.out.println( byteVar + " " +
                            doubleVar + " " +
                            floatVar + " " +
                            intVar + " " +
                            longVar + " " +
                            shortVar);

        String str = Double.toString(3.14);
        System.out.println("PI = " + str);
    }
}
