import java.util.*;
class Continent   // Multilevel Inheritance
{
    Scanner sc = new Scanner(System.in);
    String cont;
    void accept1()
    {
        System.out.println("Enter Name of Continent : ");
        cont = sc.next();
    }
    void display1()
    {
        System.out.println("Continent : "+cont);
    }

}
class Country extends Continent
{
    String count;
    void accept2()
    {
        System.out.println("Enter Name of Country : ");
        count = sc.next();
    }
    void display2()
    {
        System.out.println("Country : "+count);
    }
}
class State extends Country
{
    String stat;
    void accept3()
    {
        System.out.println("Enter name of State : ");
        stat = sc.next();
    }
    void display3()
    {
        System.out.println("State : "+stat);
    }
}
public class Pr8_2
{
    public static void main(String[] args)
    {
        State obj = new State();
        System.out.println("Enter Your Details : ");
        obj.accept1();
        obj.accept2();
        obj.accept3();
        System.out.println("Your Details : ");
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
