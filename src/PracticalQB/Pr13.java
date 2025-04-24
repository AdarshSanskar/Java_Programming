package PracticalQB;
//Question No. 13: Write a Program to Handle Mouse Events

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pr13 extends JFrame {
    JLabel mouseLabel;

    Pr13() {
        setTitle("Mouse Events Example");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        requestFocus();

        mouseLabel = new JLabel("Mouse Action : ");
        mouseLabel.setBounds(100, 120, 300, 30);
        mouseLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        add(mouseLabel);

        addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                mouseLabel.setText("Mouse Action : Mouse Clicked");
            }

            public void mousePressed(MouseEvent e) {
                mouseLabel.setText("Mouse Action : Mouse Pressed");
            }

            public void mouseReleased(MouseEvent e) {
                mouseLabel.setText("Mouse Action : Mouse Released");
            }

            public void mouseEntered(MouseEvent e) {
                mouseLabel.setText("Mouse Action : Mouse Entered");
            }

            public void mouseExited(MouseEvent e) {
                mouseLabel.setText("Mouse Action : Mouse Exited");
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent e) {
                requestFocus();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Pr13();
    }
}
