

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GridClass extends JFrame {

            JLabel label1;
            JLabel label2;
            JLabel label3;
            JLabel label4;
            JPanel panel = new JPanel(new FlowLayout());
            //Note: for both this class and the Card class, the file directory may differ from what your computer has
            public GridClass()
            {
                File directory = new File("./");
                System.out.println(directory.getAbsolutePath());

                label1 = new JLabel(new ImageIcon("./src/com/company/Images/Grid/Grid1.png"));
                label2 = new JLabel(new ImageIcon("./src/com/company/Images/Grid/Grid2.png"));
                label3 = new JLabel(new ImageIcon("./src/com/company/Images/Grid/Grid3.png"));
                label4 = new JLabel(new ImageIcon("./src/com/company/Images/Grid/Grid4.jpg"));

                panel.setLayout(new GridLayout(2,2));


                panel.add(label1, 0 , 0);
                panel.add(label2, 0 , 1);
                panel.add(label3, 1 , 0);
                panel.add(label4, 1 , 1);
                this.setLayout(new FlowLayout());
                this.add(panel);
                this.setTitle("Name");
                this.pack();
                this.setVisible(true);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        }


