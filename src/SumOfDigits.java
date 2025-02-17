import java.util.*;
class SumOfDigits
{
	public static void main(String [] args)
	{
		int num, rem, sum = 0;
		System.out.println("Enter any Number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum of Digits of Number : "+sum);
	}
}