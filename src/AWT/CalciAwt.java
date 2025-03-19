package AWT;
import java.awt.*;
class CalciAwt
{
    CalciAwt()
    {
        Frame f= new Frame();
        f.setSize(500,500);
        f.setVisible(true);

        GridLayout Gl=new GridLayout(5,4,4,4);
        f.setLayout(Gl);

        Button a1 = new Button("1/x");
        Button a2 = new Button("x^2");
        Button a3 = new Button("vx");
        Button a4 = new Button("/");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button p = new Button("+");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button m = new Button("-");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button mul = new Button("x");
        Button div = new Button("+/-");
        Button b0 = new Button("0");
        Button dot = new Button(".");
        Button eq = new Button("=");

        f.add(a1);
        f.add(a2);
        f.add(a3);
        f.add(a4);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(p);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(m);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(mul);
        f.add(div);
        f.add(b0);
        f.add(dot);
        f.add(eq);
    }
    public static void main(String args[])
    {
        CalciAwt C = new CalciAwt();
    }
}
