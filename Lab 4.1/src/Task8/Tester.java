package Task8;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Task 1:\n");

        Circle circle = new Circle(4, "Yellow", true);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Circle desc: " + circle.toString() + "\n");

        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle desc: " + rectangle.toString() + "\n");

        Square square = new Square(10, "Red", false);
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println("Square desc: " + square.toString() + "\n");
    }
}
