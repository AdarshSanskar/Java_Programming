import java.util.*; // Single Level Inheritance
class Dimensions
{
    Scanner sc = new Scanner(System.in);
    int l, b, h;
    void accept()
    {
        System.out.println("Enter Length, Breadth and Height of Room : ");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
    }
}
class Calculate extends Dimensions
{
    int area, volume;
    void display()
    {
        area = l * b;
        volume = l * b * h;
        System.out.println("Area : "+area);
        System.out.println("Volume : "+volume);
    }
}
public class Pr8_1
{
    public static void main(String[] args)
    {
        Calculate cal = new Calculate();
        System.out.println("Enter Dimensions of Room : ");
        cal.accept();
        System.out.println("Result : ");
        cal.display();
    }
}
