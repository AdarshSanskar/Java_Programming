package PracticalQB;
//Question No. 14: Write a Program to Retrieve Hostname and IP Address

import java.net.*;

public class Pr14 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Hostname : " + address.getHostName());
            System.out.println("IP Address : " + address.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
