package CalculatorApp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CalculatorView extends JFrame {
    int[][] arr = new int[][] {
            {1, 2, 3},
            {4, 5, 6}
    };
    private final JButton[][] BUTTONS = new JButton[][] {
            { new JButton("("), new JButton(")"), new JButton("C"), new JButton("AC") },
            { new JButton("7"), new JButton("8"), new JButton("9"), new JButton("/") },
            { new JButton("4"), new JButton("5"), new JButton("6"), new JButton("*") },
            { new JButton("1"), new JButton("2"), new JButton("3"), new JButton("-") },
            { new JButton("0"), new JButton("."), new JButton("="), new JButton("+") }
    };
    private final JLabel LABEL_OUTPUT = new JLabel("", JLabel.CENTER);

    public CalculatorView() {
        setTitle("Calculator");
        setPreferredSize(new Dimension(300, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LABEL_OUTPUT.setBackground(Color.WHITE);
        LABEL_OUTPUT.setOpaque(true);
        LABEL_OUTPUT.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        LABEL_OUTPUT.setPreferredSize(new Dimension(0, 80));
        LABEL_OUTPUT.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

        JPanel btnPanel = new JPanel(new GridLayout(5, 4));
        for (int y = 0; y < 5; ++y) {
            for (int x = 0; x < 4; ++x) {
                BUTTONS[y][x].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
                BUTTONS[y][x].setFocusPainted(false);
                btnPanel.add(BUTTONS[y][x]);
            }
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(1, 1, 1, 1));

        mainPanel.add(LABEL_OUTPUT, BorderLayout.PAGE_START);
        mainPanel.add(btnPanel, BorderLayout.CENTER);

        getContentPane().add(mainPanel);
        pack();
        setVisible(true);
    }

    public JLabel getLabelOutput() {
        return LABEL_OUTPUT;
    }

    public JButton[][] getButtons() {
        return BUTTONS;
    }
}
