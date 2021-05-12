import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Graph {
    public static void main(String[] args) {
        JFrame window =new JFrame("Run");
//        window.setSize(640,540);
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.setVisible(true);
//
//        DrawingComponent dc = new DrawingComponent();
//        dc.repaint(new Rectangle(150,150,120,120));
//        window.add(dc);
//        JButton b=new JButton();
//        final boolean[] bool = {true};
//        b.setBounds(105,0,50,50);
//        b.setBackground(Color.red);
//        b.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                if (bool[0])
//                    b.setBackground(Color.blue);
//                else
//                    b.setBackground(Color.red);
//                bool[0] = !bool[0];
//            }
//        });

        JButton[] b=new JButton[9];
        for (int x = 0; x < b.length; x++) {
            b[x] = new JButton();
        }
        b[0] = new JButton();
        b[0].setBounds(0,0,50,50);
        b[1].setBounds(55,0,50,50);
        b[2].setBounds(110,0,50,50);
        b[3].setBounds(0,55,50,50);
        b[4].setBounds(55,55,50,50);
        b[5].setBounds(110,55,50,50);
        b[6].setBounds(0,110,50,50);
        b[7].setBounds(55,110,50,50);
        b[8].setBounds(110,110,50,50);
        for (int d = 0; d < 9; d++) {
            b[0].setBackground(Color.PINK);
            b[1].setBackground(Color.green);
            b[2].setBackground(Color.black);
            b[3].setBackground(Color.orange);
            b[4].setBackground(Color.cyan);
            b[5].setBackground(Color.white);
            b[6].setBackground(Color.yellow);
            b[7].setBackground(Color.darkGray);
            b[8].setBackground(Color.MAGENTA);

            int finalD = d;
            b[finalD].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    changeColor(b[finalD]);
                    switch (finalD) {
                        case 0:
                            changeColor(b[finalD+1]);
                            changeColor(b[finalD+3]);
                            changeColor(b[finalD+4]);
                            break;
                        case 1:
                            changeColor(b[finalD+1]);
                            changeColor(b[finalD+3]);
                            changeColor(b[finalD-1]);
                            changeColor(b[finalD+4]);
                            changeColor(b[finalD+2]);
                            break;
                        case 2:
                            changeColor(b[finalD-1]);
                            changeColor(b[finalD+3]);
                            changeColor(b[finalD+2]);
                            break;
                        case 3:
                            changeColor(b[finalD+3]);
                            changeColor(b[finalD+1]);
                            changeColor(b[finalD-3]);
                            changeColor(b[finalD+4]);
                            changeColor(b[finalD-2]);
                            break;
                        case 4:
                            changeColor(b[finalD-1]);
                            changeColor(b[finalD+3]);
                            changeColor(b[finalD+1]);
                            changeColor(b[finalD-3]);
                            changeColor(b[finalD+4]);
                            changeColor(b[finalD-4]);
                            changeColor(b[finalD-2]);
                            changeColor(b[finalD+2]);
                            break;
                        case 5:
                            changeColor(b[finalD-3]);
                            changeColor(b[finalD-1]);
                            changeColor(b[finalD+3]);
                            changeColor(b[finalD-4]);
                            changeColor(b[finalD+2]);
                            break;
                        case 6:
                            changeColor(b[3]);
                            changeColor(b[7]);
                            changeColor(b[finalD-2]);
                            break;
                        case 7:
                            changeColor(b[finalD-3]);
                            changeColor(b[finalD-1]);
                            changeColor(b[finalD+1]);
                            changeColor(b[finalD-4]);
                            changeColor(b[finalD-2]);
                            break;
                        case 8:
                            changeColor(b[finalD-3]);
                            changeColor(b[finalD-1]);
                            changeColor(b[finalD-4]);
                            break;
                    }
                }
            });

            window.add(b[d]);
        }

        window.setSize(400,400);
        window.setLayout(null);
        window.setVisible(true);
    }
    public static void changeColor(JButton b) {
        if (b.getBackground().equals(Color.red))
            b.setBackground(Color.blue);
        else
            b.setBackground(Color.red);
    }
}
