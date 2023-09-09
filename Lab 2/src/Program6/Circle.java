package Program6;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getLength() {
        return 2 * Math.PI * r;
    }

    public double getSquare() {
        return Math.PI * r * r;
    }

    public boolean isEqual(Circle circle) {
        return r == circle.r;
    }

    public boolean isBigger(Circle circle) {
        return r > circle.r;
    }

    public boolean isLess(Circle circle) {
        return r < circle.r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
