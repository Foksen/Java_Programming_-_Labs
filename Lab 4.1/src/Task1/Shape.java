package Task1;

public abstract class Shape {
    private final String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
