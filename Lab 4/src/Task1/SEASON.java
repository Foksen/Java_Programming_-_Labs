package Task1;

public enum SEASON {
    WINTER(-10),
    SPRING(5),
    SUMMER(20),
    FALL(0);

    private final double midTemp;
    private SEASON(double midTemp) {
        this.midTemp = midTemp;
    }

    public double getMidTemp() {
        return midTemp;
    }

    public String getDescription() {
        switch (this) {
            case WINTER -> { return new String("холодное время года"); }
            case SUMMER -> { return new String("тёплое время года"); }
            case FALL -> { return new String("период заморозков"); }
            case SPRING -> { return new String("период потепления"); }
        }
        return null;
    }

    public String translate() {
        switch (this) {
            case WINTER -> { return new String("зима"); }
            case SUMMER -> { return new String("лето"); }
            case FALL -> { return new String("осень"); }
            case SPRING -> { return new String("весна"); }
        }
        return null;
    }
}
