package PracticalQB;
//Question No. 15: Write a Program to Demonstrate Various Methods of URL Class

import java.net.*;

public class Pr15 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            System.out.println("URL: " + url);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Default Port: " + url.getDefaultPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        }
    }
}
