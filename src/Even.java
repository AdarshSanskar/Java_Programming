import java.util.*;
class Even
{
	public static void main(String [] args)
	{
		int i = 1;
		System.out.println("Enter the Limit : ");
		Scanner sc = new Scanner(System.in);
		int lim = sc.nextInt();
		while(i <= lim)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}