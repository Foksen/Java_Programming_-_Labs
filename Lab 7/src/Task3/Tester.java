package Task3;

public class Tester {
    public static void main(String[] args) {
        ProcessString ps = new ProcessString();
        System.out.println(ps.countLength("Привет, мир!"));
        System.out.println(ps.getOdds("Привет, мир!"));
        System.out.println(ps.invert("Привет, мир!"));
    }
}
