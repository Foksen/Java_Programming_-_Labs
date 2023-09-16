package Task4;

public class Computer {
    private BRAND brand;
    private Memory memory;
    private Monitor monitor;
    private Processor processor;

    public Computer(BRAND brand, Memory memory, Monitor monitor, Processor processor) {
        this.brand = brand;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    public BRAND getBrand() {
        return brand;
    }

    public void setBrand(BRAND brand) {
        this.brand = brand;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Описание компьютера\n" +
                "Марка: " + brand + "\n" +
                memory.toString() + "\n" +
                monitor.toString() + "\n" +
                processor.toString();
    }
}
