import java.util.*;
class sortArray
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Elements in Array : ");
		int arr[] = new int[5];
		for(int i = 0 ; i < 5 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Before Sorting : ");
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.print(" "+arr[i]);
		}
		for(int i = 0 ; i < 5 ; i++)
		{
			for(int j = 0 ; j < 5-i-1 ; j++)
			{
				if(arr[j] < arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\nElements After Sorting : ");
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}