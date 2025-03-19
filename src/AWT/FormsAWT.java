// Practical No.14
package AWT;
import java.awt.*;
import java.awt.event.*;

public class FormsAWT extends Frame
{
    FormsAWT()
    {
        setSize(500,500);
        setTitle("Registration Form");
        setBackground(Color.decode("#e6e6e6"));

        Label stud = new Label("*Student Form*");
        stud.setFont(new Font("Serif", Font.BOLD, 30));
        stud.setBounds(160,30,400,50);
        stud.setForeground(Color.decode("#131a59"));
        add(stud);

        Label name = new Label("Enter Your Name : ");
        name.setFont(new Font("Serif", Font.ITALIC, 12));
        name.setBounds(50,80,150,30);
        add(name);

        TextField nameText = new TextField();
        nameText.setFont(new Font("Serif", Font.BOLD, 15));
        nameText.setBounds(50,110,160,25);
        nameText.setBackground(Color.decode("#dfebf6"));
        nameText.setForeground(Color.decode("#4c3b71"));
        add(nameText);

        Label roll = new Label("Enter Your Roll No. : ");
        roll.setFont(new Font("Serif", Font.ITALIC, 12));
        roll.setBounds(260,80,150,30);
        add(roll);

        TextField rollText = new TextField();
        rollText.setFont(new Font("Serif", Font.BOLD, 15));
        rollText.setBounds(260,110,160,25);
        rollText.setBackground(Color.decode("#dfebf6"));
        rollText.setForeground(Color.decode("#4c3b71"));
        add(rollText);

        Label clss = new Label("Enter Your Class : ");
        clss.setFont(new Font("Serif", Font.ITALIC, 12));
        clss.setBounds(50,140,150,30);
        add(clss);

        TextField clssText = new TextField();
        clssText.setFont(new Font("Serif", Font.BOLD, 15));
        clssText.setBounds(50,170,160,25);
        clssText.setBackground(Color.decode("#dfebf6"));
        clssText.setForeground(Color.decode("#4c3b71"));
        add(clssText);

        Label div = new Label("Enter Your Division : ");
        div.setFont(new Font("Serif", Font.ITALIC, 12));
        div.setBounds(260,140,150,30);
        add(div);

        TextField divText = new TextField();
        divText.setFont(new Font("Serif", Font.BOLD, 15));
        divText.setBounds(260,170,160,25);
        divText.setBackground(Color.decode("#dfebf6"));
        divText.setForeground(Color.decode("#4c3b71"));
        add(divText);

        Label email = new Label("Enter Your Email : ");
        email.setFont(new Font("Serif", Font.ITALIC, 12));
        email.setBounds(90,200,250,30);
        add(email);

        TextField emailText = new TextField();
        emailText.setFont(new Font("Serif", Font.BOLD, 15));
        emailText.setBounds(90,230,300,25);
        emailText.setBackground(Color.decode("#aac7d8"));
        emailText.setForeground(Color.decode("#4c3b71"));
        add(emailText);

        Label password = new Label("Enter Your Password : ");
        password.setFont(new Font("Serif", Font.ITALIC, 12));
        password.setBounds(90,260,250,30);
        add(password);

        TextField passwordText = new TextField();
        passwordText.setFont(new Font("Serif", Font.BOLD, 15));
        passwordText.setBounds(90,290,300,25);
        passwordText.setBackground(Color.decode("#aac7d8"));
        passwordText.setForeground(Color.decode("#4c3b71"));
        add(passwordText);

        Label greet = new Label("");
        greet.setFont(new Font("Serif", Font.BOLD, 20));
        greet.setBounds(140,320,250,30);
        greet.setForeground(Color.BLUE);
        add(greet);

        Button signUp = new Button("Sign Up");
        signUp.setFont(new Font("Serif",Font.BOLD,20));
        signUp.setBounds(200,350,100,40);
        signUp.setBackground(Color.decode("#44576d"));
        signUp.setForeground(Color.white);
        add(signUp);
        signUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                greet.setText("Successfully Signed Up...");
            }
        });

        Button reset = new Button("Reset");
        reset.setFont(new Font("Serif",Font.BOLD,13));
        reset.setBounds(215,400,70,30);
        reset.setBackground(Color.RED);
        reset.setForeground(Color.white);
        add(reset);
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                nameText.setText("");
                rollText.setText("");
                clssText.setText("");
                divText.setText("");
                emailText.setText("");
                passwordText.setText("");
                greet.setText("");
            }
        });

        Button close = new Button("Close");
        close.setFont(new Font("Serif",Font.BOLD,10));
        close.setBounds(225,440,50,25);
        close.setBackground(Color.WHITE);
        close.setForeground(Color.BLACK);
        add(close);
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        setLayout(null);
        setVisible(true);

    }
    public static void main(String[]args)
    {
        FormsAWT form = new FormsAWT();
    }
}
