package Task2;

import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        Font TNRfont = new Font("Times New Roman", Font.PLAIN, 20);
        Font MSSansFont = new Font("MS Sans Serif", Font.PLAIN, 20);
        Font CourierFont = new Font("Courier New", Font.PLAIN, 20);

        JFrame frame = new JFrame("Program 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JTextArea text = new JTextArea("The quick brown fox jumps over the lazy dog", 5, 20);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setFont(TNRfont);
        frame.add(text, JLabel.CENTER);

        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Color");
        menuBar.add(colorMenu);

        JMenuItem blueMenu = new JMenuItem("Blue");
        colorMenu.add(blueMenu);
        blueMenu.addActionListener(l -> {
            text.setForeground(Color.BLUE);
        });

        JMenuItem redMenu = new JMenuItem("Red");
        colorMenu.add(redMenu);
        redMenu.addActionListener(l -> {
            text.setForeground(Color.RED);
        });

        JMenuItem blackMenu = new JMenuItem("Black");
        colorMenu.add(blackMenu);
        blackMenu.addActionListener(l -> {
            text.setForeground(Color.BLACK);
        });

        JMenu fontMenu = new JMenu("Font");
        menuBar.add(fontMenu);

        JMenuItem TNRMenu = new JMenuItem("Times New Roman");
        fontMenu.add(TNRMenu);
        TNRMenu.addActionListener(l -> {
            text.setFont(TNRfont);
        });

        JMenuItem MSSansMenu = new JMenuItem("MS Sans Serif");
        fontMenu.add(MSSansMenu);
        MSSansMenu.addActionListener(l -> {
            text.setFont(MSSansFont);
        });

        JMenuItem CourierMenu = new JMenuItem("Courier New");
        fontMenu.add(CourierMenu);
        CourierMenu.addActionListener(l -> {
            text.setFont(CourierFont);
        });

        frame.setJMenuBar(menuBar);

        frame.setPreferredSize(new Dimension(450, 300));
        frame.pack();
        frame.setVisible(true);
    }
}
