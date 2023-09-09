package Program9;

public class Player {
    private final int CARDS_MAX_COUNT = 5;

    private String name;
    private Card[] cards;
    private int count;

    public Player(String name) {
        this.name = name;
        cards = new Card[CARDS_MAX_COUNT];
        count = 0;
    }

    public void giveCard(Card card) {
        if (count < CARDS_MAX_COUNT) {
            cards[count++] = card;
        }
    }

    public String getInfo() {
        StringBuilder str = new StringBuilder();
        str.append("Player " + name + "\nDeck:\n");
        for (int i = 0; i < count; ++i) {
            str.append(cards[i].toString());
            str.append("\n");
        }
        return str.toString();
    }
}
