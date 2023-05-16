import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Board extends JPanel implements MouseListener {

    // This is the constructor which sets up the JFrame
    // and all other components and containers
    int xLocation;
    int yLocation;
    public Board() {
        addMouseListener(this);
        // Create and add DrawingPanel to CENTER
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // System.out.println("aaaa");

        g.setColor(Color.BLACK);
        xLocation = (int) (Math.random() * 1550)+50;
        yLocation = (int) (Math.random() * 825)+50;
        g.fillOval(xLocation, yLocation, 50, 50);
        // System.out.println("bb");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("bobbb");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

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

