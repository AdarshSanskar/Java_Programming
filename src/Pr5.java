import java.util.*;
public class Pr5
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add(10);
        v.addElement(20);
        System.out.println("Capacity : "+v.capacity());
        System.out.println("Contains : "+v.contains(10));
        System.out.println("Element At : "+v.elementAt(1));
        System.out.println("First Element : "+v.firstElement());
        System.out.println("Index of : "+v.indexOf(20));
        v.insertElementAt(30,0);
        System.out.println("Last Element : "+v.lastElement());
        v.removeElement(20);
        v.removeElementAt(1);
        System.out.println("Vector : "+v);
    }
}
