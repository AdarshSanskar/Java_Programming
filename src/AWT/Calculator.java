package AWT;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame
{
    Calculator()
    {
        setTitle("Not Your Calculator");
        setSize(400,600);
        getContentPane().setBackground(Color.decode("#3c3c3c"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTextField resultArea = new JTextField();
        resultArea.setBackground(Color.decode("#1c2123"));
        resultArea.setForeground(Color.WHITE);
        resultArea.setBounds(30,30,320,70);
        resultArea.setFont(new Font("SansSerif",Font.BOLD,40));
        resultArea.setEditable(false);
        resultArea.setText(" 0 ");

        JButton button_1 = new JButton(" 1 ");
        button_1.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_2 = new JButton(" 2 ");
        button_2.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_3 = new JButton(" 3 ");
        button_3.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_4 = new JButton(" 4 ");
        button_4.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_5 = new JButton(" 5 ");
        button_5.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_6 = new JButton(" 6 ");
        button_6.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_7 = new JButton(" 7 ");
        button_7.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_8 = new JButton(" 8 ");
        button_8.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_9 = new JButton(" 9 ");
        button_9.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_0 = new JButton(" 0 ");
        button_0.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_add = new JButton(" + ");
        button_add.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_sub = new JButton(" - ");
        button_sub.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_mul = new JButton(" * ");
        button_mul.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_div = new JButton(" / ");
        button_div.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_sqr = new JButton(" ^2 ");
        button_sqr.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_cube = new JButton(" ^3 ");
        button_cube.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_sqrt = new JButton(" Sqrt ");
        button_sqrt.setFont(new Font("SansSerif",Font.BOLD,14));
        JButton button_clr = new JButton(" CLR ");
        button_clr.setFont(new Font("SansSerif",Font.BOLD,14));
        JButton button_point = new JButton(" . ");
        button_point.setFont(new Font("SansSerif",Font.BOLD,20));
        JButton button_equal = new JButton(" = ");
        button_equal.setFont(new Font("SansSerif",Font.BOLD,20));

        JPanel panel = new JPanel();
        panel.setBounds(30, 140, 320, 380);
        panel.setBackground(Color.GRAY);
        panel.setLayout(new GridLayout(5,4,10,10));
        panel.add(button_sqrt);
        panel.add(button_sqr);
        panel.add(button_cube);
        panel.add(button_div);
        panel.add(button_7);
        panel.add(button_8);
        panel.add(button_9);
        panel.add(button_mul);
        panel.add(button_4);
        panel.add(button_5);
        panel.add(button_6);
        panel.add(button_sub);
        panel.add(button_1);
        panel.add(button_2);
        panel.add(button_3);
        panel.add(button_add);
        panel.add(button_clr);
        panel.add(button_0);
        panel.add(button_point);
        panel.add(button_equal);

        add(panel);
        add(resultArea);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        Calculator calc = new Calculator();
    }
}
