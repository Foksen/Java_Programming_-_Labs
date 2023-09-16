package Task4;

public class Monitor {
    private int diagonalSize;
    private int frequency;

    public Monitor(int diagonalSize, int frequency) {
        this.diagonalSize = diagonalSize;
        this.frequency = frequency;
    }

    public int getDiagonalSize() {
        return diagonalSize;
    }

    public void setDiagonalSize(int diagonalSize) {
        this.diagonalSize = diagonalSize;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Монитор { " +
                "диагональ экрана: " + diagonalSize + ", " +
                "частота: " + frequency + " Гц }";
    }
}
