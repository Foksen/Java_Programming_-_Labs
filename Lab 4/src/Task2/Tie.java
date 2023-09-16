package Task2;

public class Tie extends Clothes implements MenClothing {

    public Tie(SIZE size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужская вещь: " + toString());
    }

    @Override
    public String toString() {
        return "Галстук " + super.toString();
    }
}
