package Task2;

public class Tester {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        System.out.println(mc.pow(5, 4));
        System.out.println(mc.modulusComplex(5, 4));

        MathFunc mf = new MathFunc();
        System.out.println(mf.pow(3, 5));
        System.out.println(mf.modulusComplex(12, 13));
        System.out.println(mf.circleLength(4.2));
    }
}
