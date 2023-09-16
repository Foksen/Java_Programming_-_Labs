package Task4;

public class Memory {
    private String type;
    private int speed;

    public Memory(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Оперативная память { " +
                "тип: " + type + ", " +
                "частота: " + speed + " МГц }";
    }
}
