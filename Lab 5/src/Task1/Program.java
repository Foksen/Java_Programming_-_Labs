package Task1;

import javax.swing.*;
import java.awt.*;

public class Program {
    private static int scoreMilan = 0;
    private static int scoreRM = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Program 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(400, 300));

        GridLayout layout = new GridLayout(5, 1, 10, 10);
        panel.setLayout(layout);

        JButton btnMilan = new JButton("AC Milan");
        panel.add(btnMilan);
        JButton btnRM = new JButton("Real Madrid");
        panel.add(btnRM);

        JLabel labelRes = new JLabel("Result: 0 X 0", JLabel.CENTER);
        panel.add(labelRes);
        JLabel labelLast = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        panel.add(labelLast);
        JLabel labelWinner = new JLabel("Winner: DRAW", JLabel.CENTER);
        panel.add(labelWinner);

        btnMilan.addActionListener(e -> {
            ++scoreMilan;
            labelRes.setText("Result: " + Integer.toString(scoreMilan) +
                    " X " + Integer.toString(scoreRM));
            labelLast.setText("Last Scorer: AC MILAN");
            if (scoreMilan > scoreRM)
                labelWinner.setText("Winner: AC MILAN");
            if (scoreMilan == scoreRM)
                labelWinner.setText("Winner: DRAW");
        });

        btnRM.addActionListener(e -> {
            ++scoreRM;
            labelRes.setText("Result: " + Integer.toString(scoreMilan) +
                    " X " + Integer.toString(scoreRM));
            labelLast.setText("Last Scorer: REAL MADRID");
            if (scoreRM > scoreMilan)
                labelWinner.setText("Winner: REAL MADRID");
            if (scoreMilan == scoreRM)
                labelWinner.setText("Winner: DRAW");
        });

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
