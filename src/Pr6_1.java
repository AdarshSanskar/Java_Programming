public class Pr6_1 // Autoboxing
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 20;
        Integer xo = Integer.valueOf(x); // Manual
//      Integer xo = new Integer(10);
        System.out.println("X : "+x);
        System.out.println("XO : "+xo);
        Integer yo = y; // Automatic
        System.out.println("Y : "+y);
        System.out.println("YO : "+yo);
    }
}
