package JavaPracticals;
//Practical No. 3: Write a program to demonstrate use of: if statement (all forms of if statement) Switch-Case statement Different types of loops (for, while and do-while)
// Even Number Series
import java.util.*;
public class Pr3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit of Series : ");
        int lim = sc.nextInt();
        for(int i = 1 ; i <= lim ; i++){
            if(i % 2 == 0){
                System.out.print(i+"  ");
            }
        }
    }
}
