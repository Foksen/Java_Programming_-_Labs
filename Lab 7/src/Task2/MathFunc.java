package Task2;

public class MathFunc implements MathCalculable {
    public double circleLength(double radius) {
        return 2 * PI * radius;
    }

    @Override
    public double pow(double x, double n) {
        return Math.pow(x, n);
    }

    @Override
    public double modulusComplex(double Re, double Im) {
        return Math.sqrt(Re * Re + Im * Im);
    }
}
