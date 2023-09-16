package Task3.Shop;

public class Good {
    private final String title;
    private final double priceRub;

    public static Good[] goods = new Good[] {
            new Good("Часы", 999),
            new Good("Телефон", 8990),
            new Good("Ноутбук", 27990)
    };

    private Good(String title, double priceRub) {
        this.title = title;
        this.priceRub = priceRub;
    }

    public String getTitle() {
        return title;
    }

    public double getPriceRub() {
        return priceRub;
    }

    public double convertPrice(CURRENCY newCurrency) {
        switch (newCurrency) {
            case RUB -> { return priceRub; }
            case USD -> { return priceRub / 95; }
            case EUR -> { return priceRub / 105; }
        }
        return 0;
    }
}
