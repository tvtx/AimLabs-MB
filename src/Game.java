import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game implements MouseListener {
    JFrame frame;
    JLabel startMessage;

    private Main main;

    public static int amtClicked = 0;
    public static long reactionTime = 0;
    String amtclick = "";
    String accuracy = "";


    static boolean click;
    public Game(Main main){
        this.main = main;
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

    public long getReactionTime(){
        return reactionTime;
    }

    public String getAccuracy(){
        return accuracy;
    }


    public void endGame(int numClicked, long timeReacted){
        amtClicked = numClicked;
        reactionTime = timeReacted;
        amtclick = (((double) (amtClicked)/30) * 100) + "";
        accuracy = amtclick.substring(0, amtclick.indexOf(".")+2);
        System.out.println("Accuracy: " + accuracy + "%");
        System.out.println("Reaction Time: " + reactionTime + "ms");
        main.updateLabels(reactionTime, accuracy);
        frame.dispose();
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
