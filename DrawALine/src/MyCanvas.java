import java.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;

class GFG1 extends JComponent{

    public void paint(Graphics g) {

        // draw and display the line
        g.drawLine(30, 20, 80, 90);
        g.draw3DRect(50, 80, 80, 90, false);
        g.drawOval(100, 200, 50,40);
    }
}

public class MyCanvas {
    public static void main(String[] args){

        // creating object of JFrame(Window popup)
        JFrame window = new JFrame();

        // setting closing operation
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setting size of the pop window
        window.setBounds(30, 20, 200, 300);

        // setting canvas for draw
        window.getContentPane().add(new GFG1());

        // set visibility
        window.setVisible(true);
    }
}
