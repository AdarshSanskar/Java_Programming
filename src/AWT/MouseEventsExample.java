package AWT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseEventsExample extends JFrame
{
    MouseEventsExample()
    {
        setTitle("Mouse Event Listener");
        setSize(400,400);
        getContentPane().setBackground(Color.decode("#ffd8b7"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setFocusable(true);
        requestFocus();
        addWindowListener(new WindowAdapter()
        {
            public void windowActivated(WindowEvent e)
            {
                requestFocus();
            }
        });


        JLabel label = new JLabel("Mouse Action : ");
        label.setBounds(20,10,360,40);
        label.setFont(new Font("SansSerif",Font.BOLD,15));
        label.setForeground(Color.BLACK);

        JLabel label1 = new JLabel("Key Action : ");
        label1.setBounds(20,40,360,40);
        label1.setFont(new Font("SansSerif",Font.BOLD,15));
        label1.setForeground(Color.BLACK);

        JButton button1 = new JButton(" Button 1 ");
        button1.setBounds(40,80,120,120);
        button1.setBackground(Color.decode("#ffb38a"));
        button1.setFont(new Font("Impact",Font.BOLD,20));

        JButton button2 = new JButton(" Button 2 ");
        button2.setBounds(200,80,120,120);
        button2.setBackground(Color.decode("#ffb38a"));
        button2.setFont(new Font("Impact",Font.BOLD,20));

        JButton button3 = new JButton("Button 3");
        button3.setBounds(40,230,120,120);
        button3.setBackground(Color.decode("#ffb38a"));
        button3.setFont(new Font("Impact",Font.BOLD,20));

        JButton button4 = new JButton("Button 4");
        button4.setBounds(200,230,120,120);
        button4.setBackground(Color.decode("#ffb38a"));
        button4.setFont(new Font("Impact",Font.BOLD,20));

        button1.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Clicked in Button 1...");
            }
            public void mousePressed(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Pressed in Button 1...");
            }
            public void mouseReleased(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Released in Button 1...");
            }
            public void mouseEntered(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Entered in Button 1...");
            }
            public void mouseExited(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Exited from Button 1...");
            }
        });

        button2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Clicked in Button 2...");
            }
            public void mousePressed(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Pressed in Button 2...");
            }
            public void mouseReleased(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Released in Button 2...");
            }
            public void mouseEntered(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Entered in Button 2...");
            }
            public void mouseExited(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Exited from Button 2...");
            }
        });

        button3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Clicked in Button 3...");
            }
            public void mousePressed(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Pressed in Button 3...");
            }
            public void mouseReleased(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Released in Button 3...");
            }
            public void mouseEntered(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Entered in Button 3...");
            }
            public void mouseExited(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Exited from Button 3...");
            }
        });

        button4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Clicked in Button 4...");
            }
            public void mousePressed(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Pressed in Button 4...");
            }
            public void mouseReleased(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Released in Button 4...");
            }
            public void mouseEntered(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Entered in Button 4...");
            }
            public void mouseExited(MouseEvent e)
            {
                label.setText("Mouse Action : Mouse Exited from Button 4...");
            }
        });

        addKeyListener(new KeyListener()
        {
            public void keyTyped(KeyEvent e)
            {
                label1.setText("Key Action : Key Typed");
            }
            public void keyPressed(KeyEvent e)
            {
                label1.setText("Key Action : Key Pressed");
            }
            public void keyReleased(KeyEvent e)
            {
                label1.setText("Key Action : Key Released");
            }
        });

        add(label);
        add(label1);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new MouseEventsExample();
    }
}
