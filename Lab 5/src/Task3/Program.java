package Task3;

import javax.swing.*;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        try {
            JFrame frame = new JFrame("Program 3");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new JPanelBackground(args[0]));
            frame.pack();
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setVisible(true);
        } catch (IOException e) {
            System.out.println("Couldn't find an image");
        }
    }
}
