package Task5;

import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Task 5:\n");

        Book[] bookShelf = new Book[] {
                new Book("Book 1"),
                new Book("Book 2"),
                new Book("Book 3")
        };

        Reader readerIgor = new Reader("Igor Zholobov", 461, "IIT", "07.02.2004", "+79535516366");
        readerIgor.takeBook(5);
        readerIgor.takeBook(bookShelf[0], bookShelf[1], bookShelf[2]);
        readerIgor.returnBook(2);
        readerIgor.returnBook(bookShelf[0], bookShelf[2]);

        System.out.println(readerIgor.toString());
    }
}
