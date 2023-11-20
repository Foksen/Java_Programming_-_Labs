package Task1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Program {
    private static final JButton[] buttons = new JButton[] {
            new JButton("СЗАО"),
            new JButton("САО"),
            new JButton("СВАО"),
            new JButton("ЗАО"),
            new JButton("ЦАО"),
            new JButton("ВАО"),
            new JButton("ЮЗАО"),
            new JButton("ЮАО"),
            new JButton("ЮВАО")
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame(" ");
        frame.setTitle("Program 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setPreferredSize(new Dimension(300, 350));

        JLabel labelOutput = new JLabel("", JLabel.CENTER);
        labelOutput.setBackground(Color.WHITE);
        labelOutput.setOpaque(true);
        labelOutput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        labelOutput.setPreferredSize(new Dimension(0, 80));

        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(3, 3));

        for (JButton button : buttons) {
            panelButtons.add(button);
            button.setFocusPainted(false);
            String btnText = button.getText();
            // MouseAdapter - упрощённый MouseEventListener
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    labelOutput.setText("Сейчас вы в " + btnText);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e);
                    labelOutput.setText("Сейчас вы не в Москве...");
                }
            });
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(1, 1, 1, 1));
        mainPanel.add(labelOutput, BorderLayout.PAGE_START);
        mainPanel.add(panelButtons, BorderLayout.CENTER);

        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
