package Task3;

public class Book implements Printable {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("------КНИГА------");
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("----------------");
    }
}
