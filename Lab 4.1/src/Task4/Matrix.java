package Task4;

import java.text.DecimalFormat;

public class Matrix {
    public final int m;
    public final int n;
    public double[][] fields;

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        fields = new double[m][n];
    }

    public Matrix(int m, int n, double[][] a) {
        this.m = m;
        this.n = n;
        this.fields = a;
    }

    public Matrix sum(Matrix A) {
        if (n != A.n || m != A.m)
            return null;

        double[][] newFields = new double[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                newFields[i][j] = fields[i][j] + A.fields[i][j];
            }
        }
        return new Matrix(m, n, newFields);
    }

    public Matrix multiply(double a) {
        double[][] newFields = new double[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                newFields[i][j] = a * fields[i][j];
            }
        }
        return new Matrix(m, n, newFields);
    }

    public Matrix multiply(Matrix A) {
        if (n != A.m)
            return null;

        double[][] newFields = new double[m][A.n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < A.n; ++j) {
                double s = 0;
                for (int k = 0; k < n; ++k) {
                    s += fields[i][k] * A.fields[k][j];
                }
                newFields[i][j] = s;
            }
        }
        return new Matrix(m, A.n, newFields);
    }

    public void print() {
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                DecimalFormat formatter = new DecimalFormat();
                formatter.setDecimalSeparatorAlwaysShown(false);
                System.out.printf("[%5s]", formatter.format(fields[i][j]));
            }
            System.out.println();
        }
    }
}
