package Program9;

public class Tester {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Player player1 = new Player("Igor");
        for (int i = 0; i < 5; ++i) {
            player1.giveCard(deck.takeCard());
        }
        System.out.println(player1.getInfo());

        Player player2 = new Player("Andrew");
        for (int i = 0; i < 5; ++i) {
            player2.giveCard(deck.takeCard());
        }
        System.out.println(player2.getInfo());
    }
}
