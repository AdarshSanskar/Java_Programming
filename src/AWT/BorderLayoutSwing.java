package AWT;
import javax.swing.*;
import java.awt.*;

class BorderLayoutSwing
{
    BorderLayoutSwing()
    {
        JFrame F1 = new JFrame("Border Layout");
        F1.setSize(500, 500);
        F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F1.setLayout(new BorderLayout());

        JButton a1 = new JButton("Top");
        JButton a2 = new JButton("Left");
        JButton a3 = new JButton("Right");
        JButton a4 = new JButton("Bottom");
        JButton a5 = new JButton("Center");

        F1.add(a1, BorderLayout.NORTH);
        F1.add(a2, BorderLayout.WEST);
        F1.add(a3, BorderLayout.EAST);
        F1.add(a4, BorderLayout.SOUTH);
        F1.add(a5, BorderLayout.CENTER);

        F1.setVisible(true);
    }

    public static void main(String[] args)
    {
        BorderLayoutSwing border = new BorderLayoutSwing();
    }
}
