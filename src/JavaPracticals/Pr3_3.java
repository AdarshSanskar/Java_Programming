package JavaPracticals;
//Practical No. 3: Write a program to demonstrate use of: if statement (all forms of if statement) Switch-Case statement Different types of loops (for, while and do-while)
// Days of Week
import java.util.*;
public class Pr3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number (1 to 7) : ");
        int no = sc.nextInt();
        switch(no){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}
