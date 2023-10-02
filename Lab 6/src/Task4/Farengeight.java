package Task4;

public class Farengeight implements Convertable {
    private double value;

    public Farengeight(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double convert() {
        return 5. / 9. * (value - 32);
    }
}
