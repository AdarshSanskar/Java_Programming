//Practical No. 15
package AWT;
import java.awt.*;
public class NotepadAWT extends Frame
{
    NotepadAWT()
    {
        setSize(500,500);
        setTitle("Not Your Notepad");

        MenuBar mb=new MenuBar();
        Menu menu1=new Menu("File");
        Menu submenu=new Menu("Save To");
        MenuItem i1=new MenuItem("Open");
        MenuItem i2=new MenuItem("Save");
        MenuItem i3=new MenuItem("Save As");
        MenuItem i4=new MenuItem("D:\\Adarsh\\Java");
        MenuItem i5=new MenuItem("D:\\Adarsh\\Programs");
        menu1.add(i1);
        menu1.add(i2);
        menu1.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu1.add(submenu);
        mb.add(menu1);
        Menu menu2 = new Menu("Edit");
        MenuItem m1 = new MenuItem("Copy");
        MenuItem m2 = new MenuItem("Paste");
        MenuItem m3 = new MenuItem("Select All");
        MenuItem m4 = new MenuItem("Deselect All");
        menu2.add(m1);
        menu2.add(m2);
        menu2.add(m3);
        menu2.add(m4);
        mb.add(menu2);
        Menu menu3 = new Menu("View");
        MenuItem n1 = new MenuItem("Zoom");
        MenuItem n2 = new MenuItem("Work Wrap");
        menu3.add(n1);
        menu3.add(n2);
        mb.add(menu3);
        setMenuBar(mb);

        TextArea text = new TextArea();
        text.setFont(new Font("Serif", Font.BOLD, 15));
        text.setBounds(5,50,490,440);
        add(text);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        NotepadAWT note = new NotepadAWT();
    }
}
