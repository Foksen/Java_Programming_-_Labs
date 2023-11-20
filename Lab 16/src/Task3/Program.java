package Task3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Program 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 15;
        gbc.insets = new Insets(5, 0, 5, 0);

        gbc.weightx = 1;
        gbc.gridy = 0;
        gbc.gridx = 0;
        panel.add(new JLabel("Service"), gbc);

        gbc.weightx = 3;
        gbc.gridy = 0;
        gbc.gridx = 1;
        JTextField serviceInput = new JTextField("");
        panel.add(serviceInput, gbc);

        gbc.weightx = 1;
        gbc.gridy = 1;
        gbc.gridx = 0;
        panel.add(new JLabel("User"), gbc);

        gbc.weightx = 3;
        gbc.gridy = 1;
        gbc.gridx = 1;
        JTextField userInput = new JTextField("");
        panel.add(userInput, gbc);

        gbc.weightx = 1;
        gbc.gridy = 2;
        gbc.gridx = 0;
        panel.add(new JLabel("Password"), gbc);

        gbc.weightx = 3;
        gbc.gridy = 2;
        gbc.gridx = 1;
        JTextField passwordInput = new JTextField("");
        panel.add(passwordInput, gbc);

        gbc.weightx = 1;
        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        JLabel output = new JLabel("");
        panel.add(output, gbc);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkData(serviceInput.getText(), userInput.getText(), passwordInput.getText())) {
                    output.setForeground(Color.GREEN);
                    output.setText("Correct");
                }
                else {
                    output.setForeground(Color.RED);
                    output.setText("Incorrect");
                }
            }
        };

        serviceInput.addActionListener(listener);
        userInput.addActionListener(listener);
        passwordInput.addActionListener(listener);

        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.setVisible(true);
    }

    private static boolean checkData(String service, String user, String pass) {
        return service.equals("java") && user.equals("igor") && pass.equals("qwerty");
    }
}
