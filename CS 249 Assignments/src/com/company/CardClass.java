package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.math.*;

public class CardClass extends JFrame {

            JLabel label1;
            JLabel label2;
            JLabel label3;
            JPanel panel = new JPanel(new FlowLayout());
            //Note: for both this class and the Grid class, the file directory may differ from what your computer has
            public CardClass()
            {
                File directory = new File("./");
                System.out.println(directory.getAbsolutePath());
                int x;
                int y;
                int z;

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

                panel.setLayout(new GridLayout(1,3));


                panel.add(label1, 0 , 0);
                panel.add(label2, 0 , 1);
                panel.add(label3, 0 , 2);
                this.setLayout(new FlowLayout());
                this.add(panel);
                this.setTitle("Cards");
                this.pack();
                this.setVisible(true);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        }


