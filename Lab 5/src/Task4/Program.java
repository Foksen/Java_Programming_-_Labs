package Task4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Program extends JFrame {
    static final int IMAGES_COUNT = 8;
    static final int IMAGE_WIDTH = 320;
    static final int IMAGE_HEIGHT = 320;

    static int currentImage = 0;

    public Program() {}

    public static void main(String[] args) throws Exception {
        final Image[] images = new Image[IMAGES_COUNT];
        for (int i = 0; i < IMAGES_COUNT; ++i) {
            images[i] = ImageIO.read(new File(
                    "C:\\Users\\Igor\\University\\S3\\Java programming\\Projects\\Lab 5\\src\\Task4\\"
                            + Integer.toString(i + 1) + ".jpg"));
        }

        JFrame frame = new JFrame("Program 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(IMAGE_WIDTH, IMAGE_HEIGHT);
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(images[currentImage], 0, 0, this);
            }
        };
        panel.setPreferredSize(new Dimension(IMAGE_WIDTH, IMAGE_HEIGHT));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

        class AnimationThread extends Thread {
            @Override
            public void run() {
                while (!currentThread().isInterrupted()) {
                    try {
                        sleep(100);
                        currentImage = (currentImage + 1) % IMAGES_COUNT;
                        panel.repaint();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        AnimationThread thread = new AnimationThread();
        thread.start();
    }
}
