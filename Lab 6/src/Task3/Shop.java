package Task3;

public class Shop implements Printable {
    private String title;
    private int number;

    public Shop(String title, int number) {
        this.title = title;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("------ЖУРНАЛ------");
        System.out.println("Название: " + title);
        System.out.println("Номер: " + number);
        System.out.println("-----------------");
    }
}
