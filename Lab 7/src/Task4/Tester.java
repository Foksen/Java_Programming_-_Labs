package Task4;

public class Tester {
    public static void main(String[] args) {
        Printable[] printables = new Printable[]{
                new Magazine("Умелые ручки"),
                new Book("461 градус по Фаренгейту"),
                new Magazine("Аргументы и факты"),
                new Magazine("Огонёк"),
                new Book("Война и мир"),
                new Book("Преступление и наказание")
        };

        System.out.println("Журналы:");
        Magazine.printMagazines(printables);

        System.out.println("\nКниги:");
        Book.printBooks(printables);
    }
}
