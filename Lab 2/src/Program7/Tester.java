package Program7;

public class Tester {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.printInfo();
        bookshelf.addBook("UknownAuthor1", "Book1", 1998);
        bookshelf.addBook("UknownAuthor2", "Book2", 1932);
        bookshelf.printInfo();
        bookshelf.sortBooks();
        bookshelf.printInfo();
        bookshelf.addBook("UknownAuthor3", "Book3", 1788);
        bookshelf.sortBooks();
        bookshelf.printInfo();
    }
}
