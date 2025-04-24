package PracticalQB;
// Question No.5: Develop program to implement: Multilevel inheritance.
import java.util.*;
class Student{
    Scanner sc = new Scanner(System.in);
    int roll;
    String name;
    String cls;
    void getDataStudent(){
        System.out.println("Enter Roll No. : ");
        roll = sc.nextInt();
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter Class : ");
        cls = sc.next();
    }
    void putDataStudent(){
        System.out.println("Roll No. : "+roll);
        System.out.println("Name : "+name);
        System.out.println("Class : "+cls);
    }
}

class Marks extends Student{
    int m1, m2, m3;
    void getDataMarks(){
        System.out.println("Enter Marks of Three Subjects : ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }
    void putDataMarks(){
        System.out.println("Marks of Subjects : "+m1+" "+m2+" "+m3);
    }
}

class Sports extends Marks{
    int sm;
    void getDataSports(){
        System.out.println("Enter Marks in Sports : ");
        sm = sc.nextInt();
    }
    void putDataSports(){
        System.out.println("Marks in Sports : "+sm);
    }
}
public class Pr5 {
    public static void main(String[] args) {
        Sports s = new Sports();
        System.out.println("Enter Data...");
        s.getDataStudent();
        s.getDataMarks();
        s.getDataSports();
        System.out.println("\n\nData...\n");
        s.putDataStudent();
        s.putDataMarks();
        s.putDataSports();
    }
}
