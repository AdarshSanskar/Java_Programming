class Addition
{
    int n1;
    int n2;
    Addition()
    {
        n1 = 10;
        n2 = 20;
    }
    Addition(int a, int b)
    {
        n1 = a;
        n2 = b;
    }
    void add()
    {
        System.out.println("Addition : "+(n1+n2));
    }
}
public class Pr7_5
{
    public static void main(String[] args)
    {
        Addition obj = new Addition();
        obj.add();
        Addition obj1 = new Addition(30,40);
        obj1.add();
    }
}
