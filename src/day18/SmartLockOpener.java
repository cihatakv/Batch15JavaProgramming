package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK");
        System.out.println("WHAT'S THE PASSWORD");
        String password = scan.next();
        while (!password.equals("B15")){
            System.out.println("WRONG PASSWORD");
            password = scan.next();
        }
            System.out.println("OPEN SESAME OPEN");
    }
}
