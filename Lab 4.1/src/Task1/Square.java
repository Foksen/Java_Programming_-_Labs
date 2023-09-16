package Task1;

public class Square extends Shape {
    private final double a;

    public Square(double a) {
        super("Square");
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
