package Task3;
import Task3.Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix<Double> m1 = new Matrix<>(2, 3, new Double[][] {
                {1., 2.4, 3.1},
                {4.4, 5.12, 6.3}});
        m1.print();

        Matrix<String> m2 = new Matrix<>(4, 3, new String[][] {
                {"ab", "cd", "ef"},
                {"gh", "ij", "kl"},
                {"mn", "op", "qr"},
                {"st", "uv", "wx"}
        });
        m2.print();
    }
}
