package Task4;

public class Tester {
    public static void main(String[] args) {
        Matrix A = new Matrix(2, 3, new double[][]{ {1, 2, 3}, {4, 5, 6}});
        Matrix B = new Matrix(2, 3, new double[][]{ {2, 5, 3}, {1, -4, 9}});
        Matrix C = new Matrix(3, 2, new double[][]{ {8, 2}, {0, 3}, {-11, -2}});

        System.out.println("Matrix A:");
        A.print();

        System.out.println("\nMatrix B:");
        B.print();

        System.out.println("\nMatrix C:");
        C.print();

        System.out.println("\nA + B:");
        A.sum(B).print();

        System.out.println("\n12.4 * B:");
        B.multiply(12.4).print();

        System.out.println("\nA * C:");
        A.multiply(C).print();
    }
}
