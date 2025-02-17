import java.lang.*;
class CommandLineInput
{
	public static void main(String[]args)
	{
		System.out.println("My Name is : "+args[0]);
		System.out.println("My Class is : "+args[1]);
		int n1, n2;
		/*
		n1 = args[2];
		n2 = args[3];
		*/
		System.out.println("Addition of n1 + n2 : (String)"+(args[2]+args[3]));
		n1 = Integer.parseInt(args[2]);
		n2 = Integer.parseInt(args[3]);
		System.out.println("Addition of n1 + n2 : (Integer)"+(n1+n2));
	}
}