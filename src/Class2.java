class Class2
{
	int a = 10, b = 20;
	int add()
	{
		return a+b;
	}
	void display(Class2 obj)
	{
		System.out.println("Addition : "+obj.add());
	}
}
class Class1
{
	public static void main(String [] args)
	{
		Class2 obj = new Class2();
		obj.display(obj);
	}
}