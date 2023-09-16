package Task2;

public class Skirt extends Clothes implements WomenClothing {

    public Skirt(SIZE size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская вещь: " + toString());
    }

    @Override
    public String toString() {
        return "Юбка " + super.toString();
    }
}
