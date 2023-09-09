package Program7;

import java.util.Arrays;
import java.util.Comparator;

public class Bookshelf {
    private final int BOOK_CAPACITY;
    private int k;
    private Book[] books;

    public Bookshelf() {
        BOOK_CAPACITY = 20;
        k = 0;
        books = new Book[BOOK_CAPACITY];
    }

    public boolean addBook(String author, String title, int year) {
        if (k < BOOK_CAPACITY) {
            books[k++] = new Book(author, title, year);
            return true;
        }
        return false;
    }

    public void sortBooks() {
        for (int i = 0; i < k - 1; ++i) {
            for (int j = i + 1; j < k; ++j) {
                if (books[i].getYear() > books[j].getYear()) {
                    Book temp = books[j];
                    books[j] = books[i];
                    books[i] = temp;
                }
            }
        }
    }

    public void printInfo() {
        System.out.println("\nBookshelf: ");
        for (int i = 0; i < k; ++i) {
            System.out.println("Book " + (i + 1) + " : " + books[i].toString());
        }
    }
}
