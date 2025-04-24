package PracticalQB;
//Question No. 11:Write program to demonstrate the use of border layout. The layout shows four
//buttons at four sides with captions “left”, “right”, “top” and “bottom” using
//Swing Components.
import javax.swing.*;
import java.awt.*;

public class Pr11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JButton top = new JButton("Top");
        JButton bottom = new JButton("Bottom");
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");

        frame.add(top, BorderLayout.NORTH);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);

        frame.setVisible(true);
    }
}

