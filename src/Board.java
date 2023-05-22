import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Board extends JPanel implements MouseListener {

    // This is the constructor which sets up the JFrame
    // and all other components and containers
    int xLocation = 0;
    int yLocation = 0;

    Game game;
    public Board(Game g) {
        addMouseListener(this);
        game = g;
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                int clickX = e.getX();
                int clickY = e.getY();

                if (isClickedOnCircle(clickX, clickY)) {
                    System.out.println("yass");
                }
                else {
                    System.out.println("naurr");
                }
                repaint();


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
        });


    }

    public boolean isClickedOnCircle(int clickX, int clickY) {
        int circleRadius = 25; // Assuming a fixed radius of 25 for simplicity
        int circleCenterX = xLocation + circleRadius;
        int circleCenterY = yLocation + circleRadius;

        int distance = (int) Math.sqrt(Math.pow(clickX - circleCenterX, 2) + Math.pow(clickY - circleCenterY, 2));

        return distance <= circleRadius;
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

