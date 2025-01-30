class StringFunctions
{
    public static void main(String[] args)
    {
        String str = "Hello World";
        String str2 = " hello world";
        System.out.println("String Functions on : ");
        System.out.println("String 1 : "+str);
        System.out.println("String 2 : "+str2);
        System.out.println("Character At Index 3 : "+str.charAt(3));
        System.out.println("Length of String : "+str.length());
        System.out.println("Substring within String : "+str.substring(0,4));
        System.out.println("Does String Contains \"World\" : "+str.contains("World"));
        System.out.println("Is String 1 Equal to String 2 (Case Sensitive): "+str.equals(str2));
        System.out.println("Is String 1 Equal to String 2 (Case InSensitive): "+str.equalsIgnoreCase(str2));
        System.out.println("Is String 1 Empty : "+str.isEmpty());
        System.out.println("String 1 + String 2 : "+str.concat(str2));
        System.out.println("Replace H with F : "+str.replace('H','F'));
        System.out.println("Index of W : "+str.indexOf('W'));
        System.out.println("Last Index of L : "+str.lastIndexOf('l'));
        System.out.println("String 1 in Lower Case : "+str.toLowerCase());
        System.out.println("String 1 in Upper Case : "+str.toUpperCase());
        System.out.println("String 2 without Space at End : "+str.trim());
    }
}
