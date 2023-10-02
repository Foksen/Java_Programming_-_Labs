package Task4;

public class Tester {
    public static void main(String[] args) {
        Celsius celsius = new Celsius(32.);
        System.out.printf("%.2f *C = %.2f *F\n", celsius.getValue(), celsius.convert());

        Farengeight farengeight = new Farengeight(84.);
        System.out.printf("%.2f *F = %.2f *C", farengeight.getValue(), farengeight.convert());
    }
}
