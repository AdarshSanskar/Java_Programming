import java.util.*;
class NumberCount
{
	public static void main(String [] args)
	{
		int num, rem, sum = 0, i = 0;
		System.out.println("Enter any Number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			i++;
		}
		System.out.println("Digits in Number : "+i);
	}
}