import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class DrawingComponent extends JComponent {
    public boolean[] squares = new boolean[8];
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
//
//        Color red = new Color(255,102,145);
//
//        g2.setColor(red);
//
//
//        Rectangle rect1 = new Rectangle(10,10,50,200);
//
//        g2.fill(rect1);
//        g.setColor(Color.blue);
//        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(100,100,50,20);
//        g2.fill(ellipse1);
//
//        Line2D.Double line1 = new Line2D.Double(50,50,120,120);
//        g2.draw(line1);
//
//        Point2D.Double p1 = new Point2D.Double(200,500);
        for (int x = 0; x < squares.length; x++) {
            if (squares[x] == true) {
                g2.setColor(Color.red);
                switch (x) {
                    case 0:
                        g2.fillRect(0,0,50,50);
                    case 1:
                        g2.fillRect(50,0,50,50);
                    case 2:
                        g2.fillRect(100,0,50,50);
                    case 3:
                        g2.fillRect(0,50,50,50);
                    case 4:
                        g2.fillRect(50,50,50,50);
                    case 5:
                        g2.fillRect(100,50,50,50);
                    case 6:
                        g2.fillRect(0,100,50,50);
                    case 7:
                        g2.fillRect(50,100,50,50);
                    case 8:
                        g2.fillRect(100,100,50,50);
                }
            }
            if (squares[x] == false) {
                g2.setColor(Color.blue);
                switch (x) {
                    case 0:
                        g2.fillRect(0,0,50,50);
                    case 1:
                        g2.fillRect(50,0,50,50);
                    case 2:
                        g2.fillRect(100,0,50,50);
                    case 3:
                        g2.fillRect(0,50,50,50);
                    case 4:
                        g2.fillRect(50,50,50,50);
                    case 5:
                        g2.fillRect(100,50,50,50);
                    case 6:
                        g2.fillRect(0,100,50,50);
                    case 7:
                        g2.fillRect(50,100,50,50);
                    case 8:
                        g2.fillRect(100,100,50,50);
                }
            }

        }
    }
}
