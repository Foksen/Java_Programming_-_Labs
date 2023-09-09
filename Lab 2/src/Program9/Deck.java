package Program9;

public class Deck {
    private final int DECK_MAX_COUNT = 36;
    private final int SUITS_COUNT = 4;
    private final int VALUES_COUNT = 9;

    private Card[] cards;
    private int count;

    public Deck() {
        count = DECK_MAX_COUNT;
        cards = new Card[DECK_MAX_COUNT];
        initDeck();
        // mixDeck();
    }

    public void initDeck() {
        for (int i = 0; i < SUITS_COUNT; ++i) {
            for (int j = 0; j < VALUES_COUNT; ++j) {
                SUIT suit = null;
                switch (i) {
                    case 0 -> suit = SUIT.Worms;
                    case 1 -> suit = SUIT.Diamonds;
                    case 2 -> suit = SUIT.Crosses;
                    case 3 -> suit = SUIT.Spades;
                }

                VALUE value = null;
                switch (j) {
                    case 0 -> value = VALUE.Six;
                    case 1 -> value = VALUE.Seven;
                    case 2 -> value = VALUE.Eight;
                    case 3 -> value = VALUE.Nine;
                    case 4 -> value = VALUE.Ten;
                    case 5 -> value = VALUE.Jack;
                    case 6 -> value = VALUE.Queen;
                    case 7 -> value = VALUE.King;
                    case 8 -> value = VALUE.Ace;
                }

                cards[i * VALUES_COUNT + j] = new Card(suit, value);
            }
        }
    }

    public void mixDeck() {
        for (int i = 0; i < DECK_MAX_COUNT - 1; ++i) {
            int j = i + (int) Math.random() * (DECK_MAX_COUNT - i - 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card takeCard() {
        if (count > 0) {
            return cards[--count];
        }
        return null;
    }
}


