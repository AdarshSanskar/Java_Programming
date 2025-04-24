package PracticalQB;
//Question No.2: Write a program to add two integer and two float values in Vector.
import java.util.*;
public class Pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Two Integer Numbers : ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        System.out.println("Enter any Two Float Numbers : ");
        float fno1 = sc.nextFloat();
        float fno2 = sc.nextFloat();

        Vector vect = new Vector();
        vect.add(no1);
        vect.add(no2);
        vect.add(fno1);
        vect.add(fno2);

        System.out.println("2 Integer and 2 Float Numbers are added in Vector.....");
        System.out.println(vect);
    }
}
