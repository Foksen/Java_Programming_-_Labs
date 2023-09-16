package Task10;

public class Car extends Transport {
    private int HP;

    public Car(int HP) {
        this.HP = HP;
    }

    @Override
    public int calculatePrice(int weight, int distance) {
        return (int) (distance * 250 / (HP * 4) * (2500 + weight));
    }

    @Override
    public int calculateTime(int weight, int distance) {
        return (int) (distance / HP * (2500 + weight));
    }
}
