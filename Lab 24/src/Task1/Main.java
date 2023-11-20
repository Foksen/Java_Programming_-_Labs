package Task1;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex c1 = factory.createComplex();
        Complex c2 = factory.createComplex(1, 1);
        System.out.println(c1.getReal() + " " + c1.getImage());
        System.out.println(c2.getReal() + " " + c2.getImage());
    }
}
