

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.math.*;

public class TextClass extends JFrame {

            JLabel label1;
            JLabel label2;
            JLabel label3;
            JLabel label4;

            JLabel label5;
            JPanel panel = new JPanel(new FlowLayout());

            public TextClass()
            {
                int r, g, b, a;
                File directory = new File("./");
                System.out.println(directory.getAbsolutePath());

                label1 = new RotateLabel("Java");
                label2 = new RotateLabel("Java");
                label3 = new RotateLabel("Java");
                label4 = new RotateLabel("Java");
                label5 = new RotateLabel("Java");

                r = (int) (Math.random() * 255);
                g = (int) (Math.random() * 255);
                b = (int) (Math.random() * 255);
                a = (int) (Math.random() * 255);
                label1.setForeground(new Color(r ,g ,b, a));

                r = (int) (Math.random() * 255);
                g = (int) (Math.random() * 255);
                b = (int) (Math.random() * 255);
                a = (int) (Math.random() * 255);
                label2.setForeground(new Color(r ,g ,b, a));

                r = (int) (Math.random() * 255);
                g = (int) (Math.random() * 255);
                b = (int) (Math.random() * 255);
                a = (int) (Math.random() * 255);
                label3.setForeground(new Color(r ,g ,b, a));

                r = (int) (Math.random() * 255);
                g = (int) (Math.random() * 255);
                b = (int) (Math.random() * 255);
                a = (int) (Math.random() * 255);
                label4.setForeground(new Color(r ,g ,b, a));

                r = (int) (Math.random() * 255);
                g = (int) (Math.random() * 255);
                b = (int) (Math.random() * 255);
                a = (int) (Math.random() * 255);
                label5.setForeground(new Color(r ,g ,b, a));


                panel.setLayout(new GridLayout(1,5));


                panel.add(label1, 0 , 0);
                panel.add(label2, 0 , 1);
                panel.add(label3, 0 , 2);
                panel.add(label4, 0 , 3);
                panel.add(label5, 0 , 4);

                this.setLayout(new FlowLayout());
                this.add(panel);
                this.setTitle("Java");
                this.setSize(200, 200);
                this.setVisible(true);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
            private class RotateLabel extends JLabel
            {
                public RotateLabel(String text)
                {
                    super(text);
                    Font font = new Font ("TimesNewRoman", Font.ITALIC + Font.BOLD, 22);
                    FontMetrics metrics = new FontMetrics(font){};
                    Rectangle2D bounds = metrics.getStringBounds(text, null);
                    setBounds(0,0, (int) bounds.getWidth(), (int) bounds.getHeight());
                }
                @Override
                public void paintComponent(Graphics g)
                {
                    Graphics2D gx = (Graphics2D) g;
                    gx.rotate(-Math.PI / 2.0, getWidth() / 2.0,getHeight() / 2.0);
                    super.paintComponent(g);
                }
            }
        }


