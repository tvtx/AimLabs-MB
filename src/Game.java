import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game implements MouseListener {
    JFrame frame;
    JLabel startMessage;

    static boolean click;
    public Game(){
        click = false;
        frame = new JFrame("AIM LABS");
        // frame.setLayout(new BorderLayout());
        startMessage = new JLabel("\t \t \t Blobs will randomly spawn on the screen. " +
                "\n Click them as fast as possible. " +
                "\n Click anywhere to begin.");
        startMessage.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(startMessage, BorderLayout.CENTER);

        frame.setSize(1675, 925);
        frame.setVisible(true);

        frame.addMouseListener(this);
    }


    public static void setClicked(){
        click = true;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        frame.remove(startMessage);
        Board c = new Board(this);
        frame.add(c);
        frame.validate();
        frame.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        if (!click) {
//            frame.remove(startMessage);
//            System.out.println("hello");
//            setClicked();
////            c.repaint();
//            System.out.println("howdy");
//        }
//        else {
////            int clickX = e.getX();
////            int clickY = e.getY();
////
////            if (isClickedOnCircle(clickX, clickY)) {
////                System.out.println("yass");
////            }
////            else {
////                System.out.println("naurr");
////            }
//            Board c = new Board(this);
//            frame.add(c);
//            frame.validate();
//            frame.repaint();
//            System.out.println("hi");
//        }
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
