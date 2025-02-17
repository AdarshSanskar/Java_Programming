import java.util.*;
public class Pr5_3
{
    public static void main(String[] args)
    {
        Vector v = new Vector(5);
        v.addElement(Integer.valueOf(10));
        v.addElement(Float.valueOf(1.12f));
        v.addElement('c');
        v.addElement("Adarsh");
        System.out.println("Vector : "+v);
    }
}
