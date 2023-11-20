package CalculatorApp;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class CalculatorController {
    private final CalculatorModel model;
    private final CalculatorView view;
    private final DecimalFormat df;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        this.df = new DecimalFormat();
        df.setMaximumFractionDigits(model.getPrecision());
        df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));

        initButtons();
    }

    private void initButtons() {
        JButton[] inputButtons = new JButton[17];
        // 0-9
        inputButtons[0] = view.getButtons()[4][0];
        inputButtons[1] = view.getButtons()[3][0];
        inputButtons[2] = view.getButtons()[3][1];
        inputButtons[3] = view.getButtons()[3][2];
        inputButtons[4] = view.getButtons()[2][0];
        inputButtons[5] = view.getButtons()[2][1];
        inputButtons[6] = view.getButtons()[2][2];
        inputButtons[7] = view.getButtons()[1][0];
        inputButtons[8] = view.getButtons()[1][1];
        inputButtons[9] = view.getButtons()[1][2];
        // ( )
        inputButtons[10] = view.getButtons()[0][0];
        inputButtons[11] = view.getButtons()[0][1];
        // \ * - +
        inputButtons[12] = view.getButtons()[1][3];
        inputButtons[13] = view.getButtons()[2][3];
        inputButtons[14] = view.getButtons()[3][3];
        inputButtons[15] = view.getButtons()[4][3];
        // .
        inputButtons[16] = view.getButtons()[4][1];

        for (JButton button : inputButtons) {
            button.addActionListener(a -> {
                String btnText = button.getText();
                boolean isSign = (btnText.equals("(") || btnText.equals(")")
                        || btnText.equals("+") || btnText.equals("-") || btnText.equals("*") || btnText.equals("/"));

                if (isSign && !model.isEmpty())
                    model.append(" ");
                model.append(button.getText());
                if (isSign)
                    model.append(" ");

                updateView();
            });
        }

        JButton clearButton = view.getButtons()[0][2];
        clearButton.addActionListener(a -> {
            if (!model.isEmpty() && model.get().charAt(model.getLength() - 1) == ' ')
                model.deleteLast();
            model.deleteLast();
            if (!model.isEmpty() && model.get().charAt(model.getLength() - 1) == ' ')
                model.deleteLast();
            updateView();
        });

        JButton allClearButton = view.getButtons()[0][3];
        allClearButton.addActionListener(a -> {
            model.clear();
            updateView();
        });

        JButton equalsButton = view.getButtons()[4][2];
        equalsButton.addActionListener(a -> {
            try {
                String resultRPN = CalculatorRPN.infixToRPN(model.get());
                Double result = CalculatorRPN.calculateRPN(resultRPN);
                model.set(df.format(result));
                updateView();
            } catch (UnsupportedOperationException e) {
                JOptionPane.showMessageDialog(view, "Unsupported operation!",
                        "Critical error", JOptionPane.ERROR_MESSAGE);
            } catch (Exceptions.IncorrectExpressionException e) {
                JOptionPane.showMessageDialog(view, "Incorrect expression!",
                        "Critical error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(view, "Unknown exception!",
                        "Critical error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void updateView() {
        view.getLabelOutput().setText(model.get());
    }
}