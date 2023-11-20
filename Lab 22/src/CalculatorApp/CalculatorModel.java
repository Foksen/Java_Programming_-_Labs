package CalculatorApp;

public class CalculatorModel {
    private final int CALCULATOR_PRECISION = 5;
    private StringBuilder memoryBuilder;

    public CalculatorModel() {
        memoryBuilder = new StringBuilder();
    }

    public void append(String str) {
        memoryBuilder.append(str);
    }

    public void set(String str) {
        clear();
        append(str);
    }

    public boolean isEmpty() {
        return memoryBuilder.isEmpty();
    }

    public void clear() {
        memoryBuilder = new StringBuilder();
    }

    public void deleteLast() {
        if (!memoryBuilder.isEmpty())
            memoryBuilder.deleteCharAt(memoryBuilder.length() - 1);
    }

    public String get() {
        return memoryBuilder.toString();
    }

    public int getPrecision() {
        return CALCULATOR_PRECISION;
    }

    public int getLength() {
        return memoryBuilder.length();
    }
}
