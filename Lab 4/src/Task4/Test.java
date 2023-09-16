package Task4;

public class Test {
    public static void main(String[] args) {
        Computer computer1 = new Computer(
                BRAND.ASUS,
                new Memory("DDR4", 3200),
                new Monitor(24, 60),
                new Processor(3.5, 4, 4)
        );

        Computer computer2 = new Computer(
                BRAND.MSI,
                new Memory("DDR5", 5600),
                new Monitor(30, 144),
                new Processor(4.7, 4, 8)
        );

        System.out.println(computer1.toString() + "\n");
        System.out.println(computer2.toString());
    }
}
