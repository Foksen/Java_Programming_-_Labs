package Task1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CalculatorFrame extends JFrame {
    private final String[] BUTTON_TEXT = new String[]{
            "7", "8", "9", "\\",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
    };

    private final Font BUTTON_FONT = new Font(Font.SANS_SERIF, Font.BOLD, 24);

    public CalculatorFrame() {
        JLabel labelOutput = new JLabel(" ", JLabel.CENTER);
        labelOutput.setBackground(Color.WHITE);
        labelOutput.setOpaque(true);
        labelOutput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        labelOutput.setPreferredSize(new Dimension(0, 80));
        labelOutput.setFont(BUTTON_FONT);

        JPanel btnPanel = new JPanel(new GridLayout(4, 4));
        for (int y = 0; y < 4; ++y) {
            for (int x = 0; x < 4; ++x) {
                JButton btn = new JButton(BUTTON_TEXT[y * 4 + x]);
                btn.setFont(BUTTON_FONT);
                btn.setFocusPainted(false);
                btnPanel.add(btn);
                btn.addActionListener(e -> {
                    labelOutput.setText(labelOutput.getText() + btn.getText());
                });
            }
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(1, 1, 1, 1));

        mainPanel.add(labelOutput, BorderLayout.PAGE_START);
        mainPanel.add(btnPanel, BorderLayout.CENTER);

        setTitle("Calculator");
        setPreferredSize(new Dimension(300, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);
        pack();
        setVisible(true);
    }
}
