package Task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class TextDocument extends JFrame implements IDocument {
    private ICreateDocument factory;
    private String fileName;

    public TextDocument() {
        this.factory = new CreateTextDocument();
        this.fileName = "New document";
        init();
    }

    public TextDocument(String fileName) {
        this.factory = new CreateTextDocument();
        this.fileName = fileName;
        init();
    }

    public void init() {
        setTitle(fileName);
        setPreferredSize(new Dimension(500, 300));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem newFileMenu = new JMenuItem("New");
        fileMenu.add(newFileMenu);
        newFileMenu.addActionListener(l -> {
            createNew();
        });
        JMenuItem openFileMenu = new JMenuItem("Open");
        fileMenu.add(openFileMenu);
        openFileMenu.addActionListener(l -> {
            createOpen("Opened document");
        });
        JMenuItem exitFileMenu = new JMenuItem("Exit");
        fileMenu.add(exitFileMenu);
        exitFileMenu.addActionListener(l -> {
            setVisible(false);
            dispose();
        });

        JPanel panel = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        panel.add(textArea);

        getContentPane().add(panel);
        setJMenuBar(menuBar);
        pack();
        setVisible(true);
    }

    @Override
    public void createNew() {
        factory.createNew();
    }

    @Override
    public void createOpen(String fileName) {
        factory.createOpen(fileName);
    }
}
