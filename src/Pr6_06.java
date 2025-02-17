public class Pr6_06
{
    public static void main(String[] args)
    {
        Integer num = Integer.valueOf(10);
        byte n1 = num.byteValue();
        short n2 = num.shortValue();
        double n3 = num.doubleValue();
        System.out.println("Integer Object : "+num);
        System.out.println("Byte : "+n1);
        System.out.println("Short : "+n2);
        System.out.println("Double : "+n3);
    }
}
