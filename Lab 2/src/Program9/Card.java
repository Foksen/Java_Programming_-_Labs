package Program9;

public class Card {
    private SUIT suit;
    private VALUE value;

    public Card(SUIT suit, VALUE value) {
        this.suit = suit;
        this.value = value;
    }

    public SUIT getSuit() {
        return suit;
    }

    public void setSuit(SUIT suit) {
        this.suit = suit;
    }

    public VALUE getValue() {
        return value;
    }

    public void setValue(VALUE value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card {" +
                "suit = " + suit +
                ", value = " + value +
                '}';
    }
}
