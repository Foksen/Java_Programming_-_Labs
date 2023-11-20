package CalculatorApp;

public class CalculatorApp {
    private CalculatorModel model;
    private CalculatorView view;
    private CalculatorController controller;

    public CalculatorApp() { }

    public void run() {
        model = new CalculatorModel();
        view = new CalculatorView();
        controller = new CalculatorController(model, view);
    }
}
