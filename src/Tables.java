import java.util.*;
class Tables
{
	public static void main(String [] args)
	{
		System.out.println("Enter any Number : ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int i = 1;                                 
		 do
		 {
			 System.out.println(no+" * "+i+" = "+(no*i));
			 i++;
		 }while(i <= 10);
	}
}