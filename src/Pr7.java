class Test
{
    String name;
    int roll;
    String div;
    Test()
    {
        name = "Adarsh";
        roll = 61;
        div = "SYCM-MAC";
    }
    Test(String n, int r, String d)
    {
        name = n;
        roll = r;
        div = d;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll No. : "+roll);
        System.out.println("Division : "+div);
    }
}
public class Pr7
{
    public static void main(String[] args)
    {
        Test obj = new Test();
        Test obj1 = new Test("Ravi",62,"SYCM-MAC");
        obj.display();
        obj1.display();
    }
}