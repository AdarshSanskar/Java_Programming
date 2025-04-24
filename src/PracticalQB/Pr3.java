package PracticalQB;
//Question No. 3: Develop a program for implementation of different types of constructors.
import java.util.*;
class Students{
    int id;
    String name;

    Students(){
        id = 1424;
        name = "Adarsh";
    }
    Students(int i, String n){
        id = i;
        name = n;
    }
    Students(Students s){
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
        Students stud1 = new Students();
        Students stud2 = new Students(2414, "Sanskar");
        Students stud3 = new Students(stud2);
        System.out.println("\nStudent 1 : ");
        stud1.display();
        System.out.println("\nStudent 2 : ");
        stud2.display();
        System.out.println("\nStudent 3 : ");
        stud3.display();
    }
}
