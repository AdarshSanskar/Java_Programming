package PracticalQB;
//Question No. 8:Write a program to accept a password from the user and throw “Authentication
//Failure” exception if the password is incorrect and also handle it.
import java.util.*;

class AuthenticationFailureException extends Exception {
    AuthenticationFailureException(String message) {
        super(message);
    }
}

public class Pr8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "astile@1424";

        System.out.print("Enter password: ");
        String input = sc.nextLine();

        try {
            if (!input.equals(correctPassword)) {
                throw new AuthenticationFailureException("Authentication Failure");
            }
            else {
                System.out.println("Access Granted");
            }
        }
        catch (AuthenticationFailureException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}

