package PracticalQB;

//Question No.4 :Develop program to implement: Single inheritance.
import java.util.*;
class Staff{
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    void getDataStaff() {
        System.out.println("Enter ID : ");
        id = sc.nextInt();
        System.out.println("Enter Name : ");
        name = sc.next();
    }
    void putDataStaff(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
}
class Manager extends Staff {
    int sal;
    void getDataManager(){
        System.out.println("Enter Salary of Manager : ");
        sal = sc.nextInt();
    }
    void putDataManager(){
        System.out.println("Salary : "+sal);
    }
}
public class Pr4 {
    public static void main(String[] args) {
        Manager man = new Manager();
        System.out.println("Enter Data...");
        man.getDataStaff();
        man.getDataManager();
        System.out.println("\n\nData...\n");
        man.putDataStaff();
        man.putDataManager();

    }
}
