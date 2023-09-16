package Task2;

public abstract class Clothes {
    protected SIZE size;
    protected double price;
    protected String color;

    public Clothes(SIZE size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "размер = " + size +
                " (" + size.getEuroSize() +
                ") (" + size.getDescription() + ")" +
                ", цена = " + price +
                ", цвет = " + color + '}';
    }
}
