class While
{
	public static void main(String [] args)
	{
		int no = 1;
		do
		{
			if(no % 2 == 0)
			{
				System.out.println(no);
			}
			no++;
		}while (no <= 10);
	}
}