package PracticalQB;
// Question No.7: Write programs for implementation of try catch and finally block.
import java.util.*;
public class Pr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A : ");
        int a = sc.nextInt();
        System.out.println("Enter Value of B : ");
        int b = sc.nextInt();
        int result = 0;
        try {
            result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero");
        } finally {
            System.out.println("Program Executed");
        }
    }
}