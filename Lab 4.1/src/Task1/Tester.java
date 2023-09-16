package Task1;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Task 1:\n");

        Circle circle = new Circle(4);
        System.out.println("Figure type: " + circle.getType());
        System.out.println("Figure area: " + circle.getArea());
        System.out.println("Figure perimeter: " + circle.getPerimeter());
        System.out.println("Figure desc: " + circle.toString() + "\n");

        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("Figure type: " + rectangle.getType());
        System.out.println("Figure area: " + rectangle.getArea());
        System.out.println("Figure perimeter: " + rectangle.getPerimeter());
        System.out.println("Figure desc: " + rectangle.toString() + "\n");

        Square square = new Square(10);
        System.out.println("Figure type: " + square.getType());
        System.out.println("Figure area: " + square.getArea());
        System.out.println("Figure perimeter: " + square.getPerimeter());
        System.out.println("Figure desc: " + square.toString() + "\n");
    }
}
