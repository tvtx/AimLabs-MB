import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Board extends JPanel implements MouseListener {


    int xLocation = 0;
    int yLocation = 0;

    Game game;
    Timer timer;
    long startTime;
    long elapsedTime;
    long averageTime = 0;
    int count = 0;
    int clicked = 0;

    public Board(Game g) {
        addMouseListener(this);
        game = g;

        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elapsedTime = System.currentTimeMillis() - startTime;
            }
        });
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
                    System.out.println("Time elapsed: " + (elapsedTime) + "ms");
                    averageTime += (elapsedTime);
                    clicked++;
                    timer.stop();
                }
                else {

                    System.out.println("naurr");
                    System.out.println("Time elapsed: " + (elapsedTime) + "ms");
                    averageTime += (elapsedTime);
                    timer.stop();
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

        if (!timer.isRunning()) {
            startTime = System.currentTimeMillis();
            timer.start();
        }
        count++;
        System.out.println(count);
        if (count >= 31) {
            game.endGame(clicked, averageTime/30);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
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

}

