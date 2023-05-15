import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Circle extends JPanel {

    // This is the constructor which sets up the JFrame
    // and all other components and containers
    public Circle() {
        // Create and add DrawingPanel to CENTER
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("aaaa");

        g.setColor(Color.BLACK);
        int x = (int) (Math.random() * 1550)+50;
        int y = (int) (Math.random() * 825)+50;
        g.fillOval(x, y, 50, 50);
        System.out.println("bb");
    }

    // Main method just creates a PaintDemo object
}





//    public Circle(){
//        setVisible(true);
//    }
//    public void draw(){
//        repaint();
//    }
//
//    public void paint(Graphics g) {
//        super.paint(g);
//        Random rand = new Random();
//        int x = rand.nextInt(getWidth());
//        int y = rand.nextInt(getHeight());
//        int diameter = 50;
//        g.drawOval(x, y, diameter, diameter);
//    }

