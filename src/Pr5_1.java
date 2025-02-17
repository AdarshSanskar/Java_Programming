import java.util.*;
public class Pr5_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in 3X3 Array : ");
        int [][] arr = new int[3][3];
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements in Array : ");
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
