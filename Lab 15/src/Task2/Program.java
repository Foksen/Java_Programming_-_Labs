package Task2;

import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Program 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 150));

        String[] comboBoxItems = new String[]{
                "Australia",
                "China",
                "England",
                "Russia"
        };
        JComboBox<String> comboBox = new JComboBox<>(comboBoxItems);
        panel.add(comboBox);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
