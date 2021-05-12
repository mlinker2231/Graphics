import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Graph {
    static int difficulty = 0;
    public static void main(String[] args) {
        JFrame diffSelect = new JFrame("Select Difficulty");
        JButton buttonE = new JButton();
        buttonE.setText("Easy");
        JButton buttonH = new JButton();
        buttonH.setText("Hard");
        JButton buttonI = new JButton();
        buttonI.setText("Impossible");
        buttonE.setBounds(100, 100, 150, 50);
        buttonH.setBounds(100, 150, 150, 50);
        buttonI.setBounds(100, 200, 150, 50);
        diffSelect.add(buttonE);
        diffSelect.add(buttonH);
        diffSelect.add(buttonI);
        diffSelect.setSize(400, 400);
        diffSelect.setLayout(null);
        diffSelect.setVisible(true);
        buttonE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                diffSelect.setVisible(false);
                start();
            }
        });
        buttonH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                difficulty = 1;
                diffSelect.setVisible(false);
                start();
            }
        });
        buttonI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                difficulty = 2;
                diffSelect.setVisible(false);
                start();
            }
        });


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
    }

    private static void start() {
        JFrame window =new JFrame("Run");
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
        if (difficulty == 0) {
            if (b.getBackground().equals(Color.red))
                b.setBackground(Color.blue);
            else
                b.setBackground(Color.red);
        }else if (difficulty == 1){
            if (b.getBackground().equals(Color.red))
                b.setBackground(Color.blue);
            else if (b.getBackground().equals(Color.blue))
                b.setBackground(Color.green);
            else
                b.setBackground(Color.red);
        }else {
            if (b.getBackground().equals(Color.black))
                b.setBackground(Color.darkGray);
            else if (b.getBackground().equals(Color.darkGray))
                b.setBackground(Color.gray);
            else if (b.getBackground().equals(Color.gray))
                b.setBackground(Color.lightGray);
            else if (b.getBackground().equals(Color.lightGray))
                b.setBackground(Color.white);
            else
                b.setBackground(Color.black);
        }
    }
}
