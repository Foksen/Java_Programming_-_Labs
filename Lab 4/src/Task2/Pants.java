package Task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(SIZE size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужская вещь: " + toString());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская вещь: " + toString());
    }

    @Override
    public String toString() {
        return "Штаны " + super.toString();
    }
}
