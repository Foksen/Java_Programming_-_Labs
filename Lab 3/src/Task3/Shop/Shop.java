package Task3.Shop;

import java.util.Scanner;

public class Shop {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n-----Интернет-магазин-----");
        System.out.println("1 - Вывести ассортимент");
        System.out.println("2 - Информация о товаре");
        System.out.println("0 - Выход");
        System.out.println("----------------------------");

        int option = 0;
        do {
            System.out.print("\nДействие: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    for (int i = 0; i < Good.goods.length; ++i) {
                        System.out.printf("%d. %s - %.2f RUB\n",
                                i + 1,
                                Good.goods[i].getTitle(),
                                Good.goods[i].getPriceRub());
                    }
                    break;
                case 2:
                    int goodId = 0;
                    System.out.print("Введите id товара: ");
                    goodId = scanner.nextInt() - 1;
                    System.out.printf("%d. %s - %.2f RUB - %.2f USD - %.2f EUR\n",
                            goodId + 1,
                            Good.goods[goodId].getTitle(),
                            Good.goods[goodId].getPriceRub(),
                            Good.goods[goodId].convertPrice(CURRENCY.USD),
                            Good.goods[goodId].convertPrice(CURRENCY.EUR));
                    break;
            }
        } while (option != 0);
    }
}
