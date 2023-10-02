package Task4;

public class Magazine implements Printable {
    private final String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("---Magazine---");
        System.out.println(title);
        System.out.println("--------------");
    }

    static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
