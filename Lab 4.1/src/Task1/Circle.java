package Task1;

public class Circle extends Shape {
    private final double r;

    public Circle(double r) {
        super("Circle");
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
