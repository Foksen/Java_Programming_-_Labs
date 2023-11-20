package Task3;

import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Program 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem saveMenu = new JMenuItem("Save");
        fileMenu.add(saveMenu);
        fileMenu.addSeparator();
        JMenuItem exitMenu = new JMenuItem("Exit");
        fileMenu.add(exitMenu);

        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        JMenuItem copyMenu = new JMenuItem("Copy");
        editMenu.add(copyMenu);
        JMenuItem cutMenu = new JMenuItem("Cut");
        editMenu.add(cutMenu);
        JMenuItem pasteMenu = new JMenuItem("Paste");
        editMenu.add(pasteMenu);

        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        JPanel panel = new JPanel();

        JButton btn1 = new JButton("Hide");
        panel.add(btn1);
        JButton btn2 = new JButton("Show");
        panel.add(btn2);

        JTextArea textArea = new JTextArea(10, 25);
        panel.add(textArea);

        btn1.addActionListener(e -> {
            textArea.setVisible(false);
        });

        btn2.addActionListener(e -> {
            textArea.setVisible(true);
        });

        frame.setJMenuBar(menuBar);
        frame.setPreferredSize(new Dimension(300, 200));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
