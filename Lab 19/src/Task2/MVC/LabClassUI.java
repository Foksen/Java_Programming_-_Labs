package Task2.MVC;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LabClassUI extends JFrame {
    private JTextField nameInput;
    private JButton findBtn;
    private JList<String> studentsList;
    private JButton clearBtn;
    private JButton sortBtn;

    public LabClassUI() throws HeadlessException {
        setTitle("Students");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(500, 400));

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        nameInput = new JTextField("");
        findBtn = new JButton("Найти");
        studentsList = new JList<>();
        clearBtn = new JButton("Очистить");
        sortBtn = new JButton("Отсортировать");

        studentsList.setBackground(Color.WHITE);
        studentsList.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        findBtn.setFocusPainted(false);
        clearBtn.setFocusPainted(false);
        sortBtn.setFocusPainted(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;

        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.ipady = 10;
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameInput, gbc);

        gbc.gridwidth = 2;
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(findBtn, gbc);

        gbc.ipady = 0;
        gbc.weighty = 1;
        gbc.gridwidth = 4;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(studentsList, gbc);

        gbc.ipady = 10;
        gbc.weighty = 0;
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(clearBtn, gbc);

        gbc.gridwidth = 2;
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(sortBtn, gbc);

        panel.revalidate();

        getContentPane().add(panel);
        pack();
        setVisible(true);
    }

    public JTextField getNameInput() {
        return nameInput;
    }

    public JButton getFindBtn() {
        return findBtn;
    }

    public JList<String> getStudentsList() {
        return studentsList;
    }

    public JButton getClearBtn() {
        return clearBtn;
    }

    public JButton getSortBtn() {
        return sortBtn;
    }
}
