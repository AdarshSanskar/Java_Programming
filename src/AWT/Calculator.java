package AWT;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame
{
    String str1 = "";
    String str2 = "";
    String action = "";
    Calculator()
    {
        setTitle("Not Your Calculator");
        setSize(400,600);
        getContentPane().setBackground(Color.decode("#4bc9f1"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTextField resultArea = new JTextField();
        resultArea.setBackground(Color.decode("#1c2123"));
        resultArea.setForeground(Color.WHITE);
        resultArea.setBounds(30,30,320,70);
        resultArea.setFont(new Font("SansSerif",Font.BOLD,40));
        resultArea.setEditable(false);
        resultArea.setText("");

        JButton button_1 = new JButton(" 1 ");
        button_1.setFont(new Font("SansSerif",Font.BOLD,20));
        button_1.setBackground(Color.decode("#323232"));
        button_1.setForeground(Color.WHITE);

        JButton button_2 = new JButton(" 2 ");
        button_2.setFont(new Font("SansSerif",Font.BOLD,20));
        button_2.setBackground(Color.decode("#323232"));
        button_2.setForeground(Color.WHITE);

        JButton button_3 = new JButton(" 3 ");
        button_3.setFont(new Font("SansSerif",Font.BOLD,20));
        button_3.setBackground(Color.decode("#323232"));
        button_3.setForeground(Color.WHITE);

        JButton button_4 = new JButton(" 4 ");
        button_4.setFont(new Font("SansSerif",Font.BOLD,20));
        button_4.setBackground(Color.decode("#323232"));
        button_4.setForeground(Color.WHITE);

        JButton button_5 = new JButton(" 5 ");
        button_5.setFont(new Font("SansSerif",Font.BOLD,20));
        button_5.setBackground(Color.decode("#323232"));
        button_5.setForeground(Color.WHITE);

        JButton button_6 = new JButton(" 6 ");
        button_6.setFont(new Font("SansSerif",Font.BOLD,20));
        button_6.setBackground(Color.decode("#323232"));
        button_6.setForeground(Color.WHITE);

        JButton button_7 = new JButton(" 7 ");
        button_7.setFont(new Font("SansSerif",Font.BOLD,20));
        button_7.setBackground(Color.decode("#323232"));
        button_7.setForeground(Color.WHITE);

        JButton button_8 = new JButton(" 8 ");
        button_8.setFont(new Font("SansSerif",Font.BOLD,20));
        button_8.setBackground(Color.decode("#323232"));
        button_8.setForeground(Color.WHITE);

        JButton button_9 = new JButton(" 9 ");
        button_9.setFont(new Font("SansSerif",Font.BOLD,20));
        button_9.setBackground(Color.decode("#323232"));
        button_9.setForeground(Color.WHITE);

        JButton button_0 = new JButton(" 0 ");
        button_0.setFont(new Font("SansSerif",Font.BOLD,20));
        button_0.setBackground(Color.decode("#323232"));
        button_0.setForeground(Color.WHITE);

        JButton button_add = new JButton(" + ");
        button_add.setFont(new Font("SansSerif",Font.BOLD,20));
        button_add.setBackground(Color.decode("#111111"));
        button_add.setForeground(Color.decode("#ffaf42"));

        JButton button_sub = new JButton(" - ");
        button_sub.setFont(new Font("SansSerif",Font.BOLD,30));
        button_sub.setBackground(Color.decode("#111111"));
        button_sub.setForeground(Color.decode("#ffaf42"));

        JButton button_mul = new JButton(" * ");
        button_mul.setFont(new Font("SansSerif",Font.BOLD,30));
        button_mul.setBackground(Color.decode("#111111"));
        button_mul.setForeground(Color.decode("#ffaf42"));

        JButton button_div = new JButton(" / ");
        button_div.setFont(new Font("SansSerif",Font.BOLD,25));
        button_div.setBackground(Color.decode("#111111"));
        button_div.setForeground(Color.decode("#ffaf42"));

        JButton button_sqr = new JButton(" ^2 ");
        button_sqr.setFont(new Font("SansSerif",Font.BOLD,20));
        button_sqr.setBackground(Color.decode("#111111"));
        button_sqr.setForeground(Color.decode("#ffaf42"));

        JButton button_del = new JButton(" DEL ");
        button_del.setFont(new Font("SansSerif",Font.BOLD,14));
        button_del.setBackground(Color.decode("#111111"));
        button_del.setForeground(Color.RED);

        JButton button_sqrt = new JButton(" Sqrt ");
        button_sqrt.setFont(new Font("SansSerif",Font.BOLD,14));
        button_sqrt.setBackground(Color.decode("#111111"));
        button_sqrt.setForeground(Color.decode("#ffaf42"));

        JButton button_clr = new JButton(" CLR ");
        button_clr.setFont(new Font("SansSerif",Font.BOLD,14));
        button_clr.setBackground(Color.decode("#111111"));
        button_clr.setForeground(Color.RED);

        JButton button_point = new JButton(" . ");
        button_point.setFont(new Font("SansSerif",Font.BOLD,40));
        button_point.setBackground(Color.decode("#111111"));
        button_point.setForeground(Color.decode("#ffaf42"));

        JButton button_equal = new JButton(" = ");
        button_equal.setFont(new Font("SansSerif",Font.BOLD,30));
        button_equal.setBackground(Color.decode("#111111"));
        button_equal.setForeground(Color.decode("#187c18"));

        JPanel panel = new JPanel();
        panel.setBounds(30, 140, 320, 380);
        panel.setBackground(Color.decode("#4bc9f1"));
        panel.setLayout(new GridLayout(5,4,10,10));
        panel.add(button_sqrt);
        panel.add(button_sqr);
        panel.add(button_del);
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

        button_del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String newStr = "";
                int len = str.length();
                for(int i = 0 ; i < len-1 ; i++)
                {
                    newStr = newStr + str.charAt(i);
                }
                resultArea.setText(newStr);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String latest = str + 0;
                resultArea.setText(latest);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_point.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String latest = str + '.';
                resultArea.setText(latest);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String latest = str + 1;
                resultArea.setText(latest);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String latest = str + 2;
                resultArea.setText(latest);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String latest = str + 3;
                resultArea.setText(latest);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String latest = str + 4;
                resultArea.setText(latest);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String latest = str + 5;
                resultArea.setText(latest);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String latest = str + 6;
                resultArea.setText(latest);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String latest = str + 7;
                resultArea.setText(latest);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String latest = str + 8;
                resultArea.setText(latest);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                String latest = str + 9;
                resultArea.setText(latest);
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_clr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                resultArea.setText("");
                resultArea.setForeground(Color.WHITE);
            }
        });

        button_sqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                double num = Double.parseDouble(str);
                double res = Math.sqrt(num);
                String result = String.valueOf(res);
                resultArea.setText(result);
                resultArea.setForeground(Color.GREEN);
            }
        });

        button_sqr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String str = resultArea.getText();
                double num = Double.parseDouble(str);
                double res = num * num;
                String result = String.valueOf(res);
                resultArea.setText(result);
                resultArea.setForeground(Color.GREEN);
            }
        });

        button_add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                str1 = resultArea.getText();
                resultArea.setText("");
                action = "add";
            }
        });

        button_sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                str1 = resultArea.getText();
                resultArea.setText("");
                action = "sub";
            }
        });

        button_mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                str1 = resultArea.getText();
                resultArea.setText("");
                action = "mul";
            }
        });

        button_div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                str1 = resultArea.getText();
                resultArea.setText("");
                action = "div";
            }
        });

        button_equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                double result = 0.0;
                str2 = resultArea.getText();
                double a = Double.parseDouble(str1);
                double b = Double.parseDouble(str2);
                switch(action)
                {
                    case "add": result = a + b;
                                break;
                    case "sub": result = a - b;
                                break;
                    case "mul": result = a * b;
                                break;
                    case "div": result = a / b;
                                break;
                }
//                if(action.equals("add"))
//                {
//                    result = a + b;
//                }
//                else if(action.equals("sub"))
//                {
//                    result = a - b;
//                }
//                else if(action.equals("mul"))
//                {
//                    result = a * b;
//                }
//                else if(action.equals("div"))
//                {
//                    result = a / b;
//                }
                String res = String.valueOf(result);
                resultArea.setText(res);
                resultArea.setForeground(Color.GREEN);
            }
        });

        add(panel);
        add(resultArea);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        Calculator calc = new Calculator();
    }
}
