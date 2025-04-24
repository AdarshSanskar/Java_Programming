package PracticalQB;
//Question No.1 :Write programs for implementation of different methods of: String class.
public class Pr1 {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "hello world";
        System.out.println("String 1 : "+str);
        System.out.println("String 2 : "+str2);
        System.out.println("Length of String 1 : "+str.length());
        System.out.println("SubString : "+str.substring(0,5));
        System.out.println("Compare Strings (Case Sensitive Compare To) : "+str.compareTo(str2));
        System.out.println("Compare Strings (Case InSensitive Compare To) : "+str.compareToIgnoreCase(str2));
        System.out.println("Compare Strings (Case Sensitive Equals) : "+str.equals(str2));
        System.out.println("Compare Strings (Case InSensitive Equals) : "+str.equalsIgnoreCase(str2));
        System.out.println("String 1 in Lower Case : "+str.toLowerCase());
        System.out.println("String 2 in Upper Case : "+str2.toUpperCase());
    }
}