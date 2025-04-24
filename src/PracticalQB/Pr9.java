package PracticalQB;
//Question No. 9:Write a program to create two thread one to print even numbers from 1 to 20 and
//second to print odd numbers from 1 to 20, handle the exception.
class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Pr9{
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        odd.start();
    }
}
