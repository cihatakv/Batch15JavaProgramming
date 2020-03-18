package day18;

import java.util.Scanner;

public class SmartLockOpenerWithDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK");
        String password;

        do {
            System.out.println("WHAT'S THE PASSWORD");
            password = scan.next();
        } while (!password.equals("B15"));

        System.out.println("DOOR IS OPEN!!!");
    }
}
