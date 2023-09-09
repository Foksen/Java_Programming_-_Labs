package Program5;

public class Tester {
    public static void main(String[] args) {
        Kennel kennel = new Kennel();
        kennel.printInfo();

        kennel.addDog("Жучка", 4);
        kennel.addDog("Бобик", 2);
        kennel.printInfo();

        kennel.addDog("Рыжик", 7);
        kennel.printInfo();
    }
}
