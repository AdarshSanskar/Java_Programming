import java.util.*;
class Factorial
{
	public static void main(String[]args)
	{
		int num, fact = 1;
		System.out.println("Enter any Number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i = 1 ; i <= num ; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial : " +fact);
	}
}