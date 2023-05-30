import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;


public class Main {
    static JLabel Stats;
    static Main main = new Main();
    public static Game game;
    public static void main(String[] args) {
        JFrame frame = new JFrame("AIM LABS");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel welcome = new JLabel("  Welcome to the Aim Lab. Click any mode to begin.");
        Stats = new JLabel("    Previous Game Reaction Time: ms            Previous Game Accuracy: %");
        Stats.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(Stats, BorderLayout.SOUTH);
        welcome.setFont(new Font("Arial", Font.PLAIN, 32));
        frame.add(welcome, BorderLayout.NORTH);
        JPanel buttons = new JPanel();
        JButton normal = new JButton("Normal");
        buttons.add(normal, BorderLayout.CENTER);
        frame.add(buttons);
        normal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                game = new Game(main);
            }
        });
        frame.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
        });

        frame.setSize(760, 500);
        frame.setVisible(true);
    }
    public void updateLabels(long reactionTime, String accuracy) {
        Stats.setText("    Previous Game Reaction Time: " + reactionTime + "ms             Previous Game Accuracy: "  + accuracy + "%");
    }
}

