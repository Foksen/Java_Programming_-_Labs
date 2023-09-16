package Task4;

public class Processor {
    private double frequency;
    private int coresCount;
    private int threadsCount;

    public Processor(double frequency, int coresCount, int threadsCount) {
        this.frequency = frequency;
        this.coresCount = coresCount;
        this.threadsCount = threadsCount;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCoresCount() {
        return coresCount;
    }

    public void setCoresCount(int coresCount) {
        this.coresCount = coresCount;
    }

    public int getThreadsCount() {
        return threadsCount;
    }

    public void setThreadsCount(int threadsCount) {
        this.threadsCount = threadsCount;
    }

    @Override
    public String toString() {
        return "Процессор { " +
                "частота: " + frequency + " ГГц, " +
                "число ядер: " + coresCount + ", " +
                "число потоков: " + threadsCount + " }";
    }
}
