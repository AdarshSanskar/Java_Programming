package PracticalQB;
//Question No. 12: Write a Program to Handel Kep Events
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pr12 extends JFrame {
    JLabel keyLabel;

    Pr12() {
        setTitle("Key Events Example");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        requestFocus();

        keyLabel = new JLabel("Key Action : ");
        keyLabel.setBounds(100, 120, 300, 30);
        keyLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        add(keyLabel);

        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                keyLabel.setText("Key Action : Key Typed");
            }

            public void keyPressed(KeyEvent e) {
                keyLabel.setText("Key Action : Key Pressed");
            }

            public void keyReleased(KeyEvent e) {
                keyLabel.setText("Key Action : Key Released");
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
        new Pr12();
    }
}
