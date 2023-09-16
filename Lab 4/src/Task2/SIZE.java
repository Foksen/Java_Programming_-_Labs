package Task2;

public enum SIZE {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    private SIZE(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        String res = null;
        switch (this) {
            case XXS -> res = "Детский размер";
            case XS -> res = "Очень малый размер";
            case S -> res = "Малый размер";
            case M -> res = "Средний размер";
            case L -> res = "Крупный размер";
        }
        return res;
    }
}
