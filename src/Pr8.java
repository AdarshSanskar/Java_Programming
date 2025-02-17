import java.util.*;
interface Shape
{
    double calculateArea();
}
class Rectangle implements Shape
{
    Scanner sc = new Scanner(System.in);
    double length, breadth;
    void acceptRectangle()
    {
        System.out.println("Enter Length and Breadth of Rectangle : ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
    }
    public double calculateArea()
    {
        return length*breadth;
    }
}
class Circle implements Shape
{
    Scanner sc = new Scanner(System.in);
    double radius;
    void acceptCircle()
    {
        System.out.println("Enter Radius of Circle : ");
        radius = sc.nextDouble();
    }
    public double calculateArea()
    {
        return 3.14*radius*radius;
    }
}
public class Pr8
{
    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        obj.acceptRectangle();
        System.out.println("Area of Rectangle : "+obj.calculateArea());
        Circle obj1 = new Circle();
        obj1.acceptCircle();
        System.out.println("Area of Circle : "+obj1.calculateArea());
    }
}