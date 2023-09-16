package Task3;

import java.util.ArrayList;

public class User {
    private final String username;
    private final String password;
    private ArrayList<Good> basket;

    private static User[] users = new User[]{
            new User("Igor", "qwerty"),
            new User("Andrew", "123")
    };

    private User(String username, String password) {
        this.username = username;
        this.password = password;
        this.basket = new ArrayList<>();
    }

    public static User toLogin(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password))
                return user;
        }
        return null;
    }

    public String getBasket() {
        StringBuilder stringBuilder = new StringBuilder("Корзина:\n");
        for (Good good : basket) {
            stringBuilder.append(good.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public int getBasketPrice() {
        int price = 0;
        for (Good good : basket) {
            price += good.getPrice();
        }
        return price;
    }

    public void clearBasket() {
        basket.clear();
    }

    public void addToBasket(Good good) {
        basket.add(good);
    }
}
