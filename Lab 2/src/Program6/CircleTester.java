package Program6;

public class CircleTester {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1, 2, 5);
        System.out.println("Circle1 : " + circle1.toString());
        circle1.setR(3);
        System.out.println("Circle1 : " + circle1.toString());
        circle1.setY(10);
        System.out.println("Circle1 : " + circle1.toString());
    }
}
