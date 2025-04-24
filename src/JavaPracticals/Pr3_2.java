package JavaPracticals;
//Practical No. 3: Write a program to demonstrate use of: if statement (all forms of if statement) Switch-Case statement Different types of loops (for, while and do-while)
// Sum of Digits
import java.util.*;
public class Pr3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();
        int no = num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of Digits of "+no+" : "+sum);
    }
}
