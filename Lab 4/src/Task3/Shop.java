package Task3;

public class Shop {
    private static final Good[] goods = {
            new Good("Ботинок", 500),
            new Good("Ноутбук", 5000),
            new Good("Телефон", 400),
            new Good("Мышка", 200),
            new Good("Клавиатура", 250),
            new Good("Рубашка", 700)
    };

    public static Good getGood(int id) {
        return goods[id - 1];
    }

    public static void printGoods() {
        System.out.println("Ассортимент");
        for (int i = 0; i < goods.length; ++i) {
            System.out.println(i + 1 + " " + goods[i].toString());
        }
    }
}
