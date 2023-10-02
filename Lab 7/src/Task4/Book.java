package Task4;

public class Book implements Printable {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("-----Book-----");
        System.out.println(title);
        System.out.println("--------------");
    }

    static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}
