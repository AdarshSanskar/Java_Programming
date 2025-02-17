import java.util.*;

class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = sc.nextLine();
		String rev = "";

		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		System.out.println("String in Reverse : " + rev);
	}
}
