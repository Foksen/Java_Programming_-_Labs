package Task10;

public class Plane extends Transport {
    private int maxSpeed;

    public Plane(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int calculatePrice(int weight, int distance) {
        return (int) (distance * 1500 / (maxSpeed * 1.5) * (15000 + weight));
    }

    @Override
    public int calculateTime(int weight, int distance) {
        return (int) (distance / maxSpeed * (1 + weight * 0.05));
    }
}
