package Task5;

import java.util.Calendar;
import java.util.Date;

public class Reader {
    private String fullname;
    private int id;
    private String institute;
    private String birthDate;
    private String phoneNumber;

    public Reader(String fullname, int id, String institute, String birthDate, String phoneNumber) {
        this.fullname = fullname;
        this.id = id;
        this.institute = institute;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count) {
        System.out.println(fullname + " took " + count + " book(s)");
    }

    public void takeBook(Book ... books) {
        System.out.print(fullname + " took book(s): ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " ");
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(fullname + " returned " + count + " book(s)");
    }

    public void returnBook(Book ... books) {
        System.out.print(fullname + " returned book(s): ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullname='" + fullname + '\'' +
                ", id=" + id +
                ", institute='" + institute + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
