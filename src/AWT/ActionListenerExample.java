package AWT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionListenerExample extends JFrame
{
    int count = 0;
    String res = "";
    ActionListenerExample()
    {
        setTitle("Action Listener (Counter)");
        setSize(400,400);
        getContentPane().setBackground(Color.decode("#ffd8b7"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        Label label = new Label("Counter : ");
        label.setBounds(120,50,100,50);
        label.setFont(new Font("SansSerif",Font.BOLD,20));

        Label num = new Label("0");
        num.setBounds(220,50,100,50);
        num.setFont(new Font("SansSerif",Font.BOLD,20));

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(80,150,60,30);
        buttonOne.setBackground(Color.CYAN);
        buttonOne.setFont(new Font("SansSerif",Font.BOLD,15));

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(170,150,60,30);
        buttonTwo.setBackground(Color.CYAN);
        buttonTwo.setFont(new Font("SansSerif",Font.BOLD,15));

        JButton buttonThree = new JButton("4");
        buttonThree.setBounds(260,150,60,30);
        buttonThree.setBackground(Color.CYAN);
        buttonThree.setFont(new Font("SansSerif",Font.BOLD,15));

        JButton buttonInc = new JButton("Increment");
        buttonInc.setBounds(140,230,110,40);
        buttonInc.setBackground(Color.GREEN);
        buttonInc.setFont(new Font("SansSerif",Font.BOLD,15));

        JButton buttonDec = new JButton("Decrement");
        buttonDec.setBounds(140,290,110,40);
        buttonDec.setBackground(Color.GREEN);
        buttonDec.setFont(new Font("SansSerif",Font.BOLD,14));

        buttonOne.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                res = "One";
                buttonOne.setForeground(Color.WHITE);
                buttonTwo.setForeground(Color.BLACK);
                buttonThree.setForeground(Color.BLACK);
                buttonOne.setBackground(Color.BLUE);
                buttonTwo.setBackground(Color.CYAN);
                buttonThree.setBackground(Color.CYAN);
            }
        });

        buttonTwo.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                res = "Two";
                buttonOne.setForeground(Color.BLACK);
                buttonTwo.setForeground(Color.WHITE);
                buttonThree.setForeground(Color.BLACK);
                buttonOne.setBackground(Color.CYAN);
                buttonTwo.setBackground(Color.BLUE);
                buttonThree.setBackground(Color.CYAN);
            }
        });
        buttonThree.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                res = "Four";
                buttonOne.setForeground(Color.BLACK);
                buttonTwo.setForeground(Color.BLACK);
                buttonThree.setForeground(Color.WHITE);
                buttonOne.setBackground(Color.CYAN);
                buttonTwo.setBackground(Color.CYAN);
                buttonThree.setBackground(Color.BLUE);
            }
        });

        buttonInc.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String str = num.getText();
                int no = Integer.valueOf(str);
                int no1 = 0;
                switch(res)
                {
                    case "One":
                        no1 = no + 1;
                        break;
                    case "Two":
                        no1 = no + 2;
                        break;
                    case "Four":
                        no1 = no + 4;
                        break;
                }
                num.setText(String.valueOf(no1));
            }
        });

        buttonDec.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String str = num.getText();
                int no = Integer.valueOf(str);
                int no1 = 0;
                switch(res)
                {
                    case "One":
                        no1 = no - 1;
                        break;
                    case "Two":
                        no1 = no - 2;
                        break;
                    case "Four":
                        no1 = no - 4;
                        break;
                }
                num.setText(String.valueOf(no1));
            }
        });

        add(label);
        add(num);
        add(buttonOne);
        add(buttonTwo);
        add(buttonThree);
        add(buttonInc);
        add(buttonDec);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new ActionListenerExample();
    }
}
