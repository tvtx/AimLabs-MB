import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AIM LABS");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel welcome = new JLabel("  Welcome to the Aim Lab. Click any mode to begin.");
        welcome.setFont(new Font("Arial", Font.PLAIN, 32));
        frame.add(welcome, BorderLayout.NORTH);
        JPanel buttons = new JPanel();
        JButton normal = new JButton("Normal");
        buttons.add(normal);
        frame.add(buttons);
        normal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                NormalMode game = new NormalMode();
            }
        });

        frame.setSize(760, 500);
        frame.setVisible(true);
    }
}

