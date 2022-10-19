package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class CardRefreshClass extends JFrame {

            JLabel label1;
            JLabel label2;
            JLabel label3;
            JLabel label4;
            JButton refresh;

            ActionListener refreshListener;
            JPanel panel = new JPanel(new FlowLayout());
            //Note: for both this class and the Grid class, the file directory may differ from what your computer has
            public CardRefreshClass()
            {
                File directory = new File("./");
                refresh = new JButton("Refresh");
                refreshListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Object source = e.getSource();

                        if (e.getSource() == refresh)
                        {

                            String s, l1Hold, l2Hold, l3Hold, l4Hold;
                            int x , y, z, w;
                            x = (int) (Math.random() * 52) + 1;
                            l1Hold = ("./src/com/company/Images/Cards/" + x + ".png");
                            do {
                                y = (int) (Math.random() * 52) + 1;
                            }
                            while (y == x);

                            l2Hold = ("./src/com/company/Images/Cards/" + y + ".png");
                            do {
                                z = (int) (Math.random() * 52) + 1;
                            }
                            while (z == y || z == x);

                            l3Hold = ("./src/com/company/Images/Cards/" + z + ".png");
                            do {
                                w = (int) (Math.random() * 52) + 1;
                            }
                            while (w == x || w == y || w == z);
                            l4Hold = ("./src/com/company/Images/Cards/" + w + ".png");

                            label1.setIcon(new ImageIcon(l1Hold));
                            label2.setIcon(new ImageIcon(l2Hold));
                            label3.setIcon(new ImageIcon(l3Hold));
                            label4.setIcon(new ImageIcon(l4Hold));

                        }

                    }
                };
                refresh.addActionListener(refreshListener);
                int w , x , y , z;

                x = (int) (Math.random() * 52) + 1;
                label1 = new JLabel(new ImageIcon("./src/com/company/Images/Cards/" + x + ".png"));
                do {
                    y = (int) (Math.random() * 52) + 1;
                }
                while (y == x);

                label2 = new JLabel(new ImageIcon("./src/com/company/Images/Cards/" + y + ".png"));
                do {
                    z = (int) (Math.random() * 52) + 1;
                }
                while (z == y || z == x);

                label3 = new JLabel(new ImageIcon("./src/com/company/Images/Cards/" + z + ".png"));
                do {
                    w = (int) (Math.random() * 52) + 1;
                }
                while (w == x || w == y || w == z);
                label4 = new JLabel(new ImageIcon("./src/com/company/Images/Cards/" + w + ".png"));

                panel.setLayout(new GridLayout(1,4));

                panel.add(label1, 0 , 0);
                panel.add(label2, 0 , 1);
                panel.add(label3, 0 , 2);
                panel.add(label4, 0 , 3);
                refresh.setVerticalAlignment(SwingConstants.CENTER);
                refresh.setHorizontalAlignment(SwingConstants.CENTER);
                this.setLayout(new GridLayout(2, 1));
                this.add(panel, 0 , 0 );
                this.add(refresh, 0 ,1);
                this.setTitle("Cards");
                this.pack();
                this.setVisible(true);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        }

