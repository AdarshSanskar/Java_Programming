class StringBufferNew
{
	public static void main(String [] args)
	{
		StringBuffer str1 = new StringBuffer("Hello World");
		StringBuffer str2 = new StringBuffer("hello world");
		System.out.println("String 1 : "+str1);
		System.out.println("String 2 : "+str2);
		System.out.println("Append \"Welcome\" to String 1 : "+str1.append(", Welcome"));
		System.out.println("Insert \"Namaste\" to String 2 : "+str2.insert(6," Namaste"));
		System.out.println("Delete From String 1 : "+str1.delete(11,19));
		System.out.println("Reverse String 1 : "+str1.reverse());
		System.out.println("Capacity of String 1 : "+str1.capacity());
		System.out.println("Length of String 1 : "+str1.length());
		System.out.println("Character at Index 10 : "+str1.charAt(10));  
	}
}