package JavaPracticals;
//Practical No. 5: Write a Program to Demonstrate Use of Array and Vector.
//Program For Vector Functions
import java.util.*;
public class Pr5_1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("Default Capacity of Vector : "+v.capacity());
        v.add(10);
        v.addElement(20);
        System.out.println(v);
        System.out.println("Contains(10) : "+v.contains(10));
    }
}
