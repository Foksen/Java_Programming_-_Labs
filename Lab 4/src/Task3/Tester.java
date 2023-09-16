package Task3;

import java.util.Scanner;

public class Tester {
    private static User loggedUser = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operation = 0;
        do {
            if (loggedUser == null) {
                System.out.println("\nИнтернет-магазин");
                System.out.println("1 - Войти в аккаунт");
                System.out.println("2 - Посмотреть ассортимент");
                System.out.println("0 - Выход");
                System.out.print("\nВаш выбор: ");
                operation = scanner.nextInt();

                switch (operation) {
                    case 1:
                        String login, password;
                        System.out.print("Введите логин: ");
                        login = scanner.next();
                        System.out.print("Введите пароль: ");
                        password = scanner.next();
                        loggedUser = User.toLogin(login, password);
                        if (loggedUser == null) {
                            System.out.println("Неверный логин или пароль!");
                        }
                        else {
                            System.out.println("Вы вошли, " + login);
                        }
                        break;
                    case 2:
                        Shop.printGoods();
                        break;
                }
            }
            else {
                System.out.println("\nИнтернет-магазин");
                System.out.println("1 - Выйти из аккаунта");
                System.out.println("2 - Посмотреть ассортимент");
                System.out.println("3 - Добавить товар в корзину");
                System.out.println("4 - Посмотреть корзину");
                System.out.println("5 - Стоимость товаров в корзине");
                System.out.println("6 - Купить товары из корзины");
                System.out.println("7 - Очистить корзину");
                System.out.println("0 - Выход");
                System.out.print("\nВаш выбор: ");
                operation = scanner.nextInt();

                switch (operation) {
                    case 1:
                        loggedUser = null;
                        System.out.println("Вы вышли из аккаунта");
                        break;
                    case 2:
                        Shop.printGoods();
                        break;
                    case 3:
                        int goodId = 0;
                        System.out.print("Введите id товара: ");
                        goodId = scanner.nextInt();
                        loggedUser.addToBasket(Shop.getGood(goodId));
                        System.out.println("Товар добавлен в корзину");
                        break;
                    case 4:
                        System.out.println(loggedUser.getBasket());
                        break;
                    case 5:
                        System.out.println("Стоимость товаров в корзине: " + loggedUser.getBasketPrice());
                        break;
                    case 6:
                        System.out.println("Товары были куплены!");
                        loggedUser.clearBasket();
                        break;
                    case 7:
                        System.out.println("Товары были удалены из корзины");
                        loggedUser.clearBasket();
                        break;
                }
            }
        } while (operation != 0);
    }
}
