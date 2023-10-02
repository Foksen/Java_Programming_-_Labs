package Task4;

public class Celsius implements Convertable {
    private double value;

    public Celsius(double value) {
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
        return 9. / 5. * value + 32;
    }
}
