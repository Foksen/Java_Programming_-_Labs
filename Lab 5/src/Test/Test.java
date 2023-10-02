package Test;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(200, 300));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);

        JLabel label = new JLabel("Press any button", JLabel.CENTER);
        panel.add(label);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
