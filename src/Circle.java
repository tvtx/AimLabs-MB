import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Circle extends JFrame {

    public Circle(){

    }
    public void draw(){
        repaint();
    }

    public void paint(Graphics g){
        super.paint(g);
        Random rand = new Random();
        int x = rand.nextInt()*1900;
        int y = rand.nextInt()*1060;
        g.fillOval(x, y, 10, 10);
    }
}
