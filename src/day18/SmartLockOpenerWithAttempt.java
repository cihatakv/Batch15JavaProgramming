package day18;

import java.util.Scanner;

public class SmartLockOpenerWithAttempt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK");
        System.out.println("WHAT'S THE PASSWORD");
        String password = scan.next();
        int i = 1;
        while (!password.equals("B15") && i < 3){
            System.out.println("WRONG PASSWORD YOU HAVE " + (3 - i) + " ATTEMPT LEFT!!!");
            i++;
            password = scan.next();
        }
        if (i == 3)
            System.out.println("DOOR LOCKED FOR 15 MINUTES");
        else
            System.out.println("OPEN SESAME OPEN");
    }
}
