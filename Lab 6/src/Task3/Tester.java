package Task3;

public class Tester {
    public static void main(String[] args) {
        Printable[] printables = new Printable[] {
                new Book("Преступление и наказание", "Достоевский"),
                new Shop("National Geographics", 11),
                new Shop("Умелые ручки", 7),
                new Book("Война и мир", "Толстой")
        };
        for (Printable printable : printables) {
            printable.print();
        }
    }
}
