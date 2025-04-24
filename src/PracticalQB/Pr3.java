package PracticalQB;
//Question No. 3: Develop a program for implementation of different types of constructors.
import java.util.*;
class Student{
    int id;
    String name;

    Student(){
        id = 1424;
        name = "Adarsh";
    }
    Student(int i, String n){
        id = i;
        name = n;
    }
    Student(Student s){
        id = s.id;
        name = s.name;
    }
    void display(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
}
public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stud1 = new Student();
        Student stud2 = new Student(2414, "Sanskar");
        Student stud3 = new Student(stud2);
        System.out.println("\nStudent 1 : ");
        stud1.display();
        System.out.println("\nStudent 2 : ");
        stud2.display();
        System.out.println("\nStudent 3 : ");
        stud3.display();
    }
}
