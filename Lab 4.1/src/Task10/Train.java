package Task10;

public class Train extends Transport {
    private int carriageCount;

    public Train(int carriageCount) {
        this.carriageCount = carriageCount;
    }

    @Override
    public int calculatePrice(int weight, int distance) {
        return (int) (distance * 700 / (carriageCount * 400) * (27500 + weight));
    }

    @Override
    public int calculateTime(int weight, int distance) {
        return (int) (distance / (carriageCount * 0.4) * (weight * 2));
    }
}
