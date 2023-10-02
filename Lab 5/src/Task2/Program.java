package Task2;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Program extends JFrame {
    private static Shape[] shapes = new Shape[20];

    public Program() {
        setTitle("Program 2");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Program();
        for (int i = 0; i < 20; ++i) {
            int figure = ThreadLocalRandom.current().nextInt(2);
            int color = ThreadLocalRandom.current().nextInt(0,4);
            int x1 = ThreadLocalRandom.current().nextInt(500);
            int y1 = ThreadLocalRandom.current().nextInt(500);
            int x2 = ThreadLocalRandom.current().nextInt(x1,x1 + 20);
            int y2 = ThreadLocalRandom.current().nextInt(y1,y1 + 20);
            String figColor = "";
            switch (color) {
                case 0 -> figColor = "RED";
                case 1 -> figColor = "YELLOW";
                case 2 -> figColor = "BLUE";
                case 3 -> figColor = "GREEN";
            }
            if (figure == 0)
                shapes[i] = new Circle(figColor, x1, y1, x2, y2);
            if (figure == 1)
                shapes[i] = new Rect(figColor, x1, y1, x2, y2);
        }
    }

    public void paint(Graphics g) {
        for (int i = 0; i < 20; ++i) {
            String figColor;
            int x1, y1, x2, y2;
            if (shapes[i].getClass() == Circle.class) {
                Circle circle = (Circle) shapes[i];
                figColor = circle.getColor();
                x1 = circle.getX1();
                y1 = circle.getY1();
                x2 = circle.getX2();
                y2 = circle.getY2();
                Color color = null;
                switch (figColor) {
                    case "RED" -> color = new Color(255, 0, 0);
                    case "GREEN" -> color = new Color(0, 255, 0);
                    case "BLUE" -> color = new Color(0, 0, 255);
                    case "YELLOW" -> color = new Color(255, 255, 0);
                }
                g.setColor(color);
                g.fillOval(x1, y1, x2, y2);
            }
            if (shapes[i].getClass() == Rect.class) {
                Rect rect = (Rect) shapes[i];
                figColor = rect.getColor();
                x1 = rect.getX1();
                y1 = rect.getY1();
                x2 = rect.getX2();
                y2 = rect.getY2();
                Color color = null;
                switch (figColor) {
                    case "RED" -> color = new Color(255, 0, 0);
                    case "GREEN" -> color = new Color(0, 255, 0);
                    case "BLUE" -> color = new Color(0, 0, 255);
                    case "YELLOW" -> color = new Color(255, 255, 0);
                }
                g.setColor(color);
                g.fillRect(x1, y1, x2, y2);
            }
        }
    }
}
