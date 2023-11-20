package Task3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JTextField textFieldUsername;
    private JTextField textFieldPassword;
    private JLabel labelOutput;
    private JButton btnSend;

    public View(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(300, 400));

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));

        textFieldUsername = new JTextField();
        panel.add(textFieldUsername);

        textFieldPassword = new JTextField();
        panel.add(textFieldPassword);

        btnSend = new JButton("Send");
        panel.add(btnSend);

        labelOutput = new JLabel("", JLabel.CENTER);
        panel.add(labelOutput);

        getContentPane().add(panel);
        pack();
        setVisible(true);
    }

    public void updateOutput(String output) {
        labelOutput.setText(output);
    }

    public String getInputUsername() {
        return textFieldUsername.getText();
    }

    public String getInputPassword() {
        return textFieldPassword.getText();
    }

    public void setBtnAction(ActionListener l) {
        btnSend.addActionListener(l);
    }
}
