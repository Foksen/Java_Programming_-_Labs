package Task3;

public class Matrix <N> {
    public final int m;
    public final int n;
    public N[][] fields;

    public Matrix(int m, int n, N[][] a) {
        this.m = m;
        this.n = n;
        this.fields = a;
    }


    public void print() {
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print("[" + fields[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
