package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();

        System.out.println("Please enter your city, State: ");
        String city = scan.nextLine();

        System.out.println("Please enter your address: ");
        String address = scan.nextLine();


        System.out.println("Your name : " + name);
        System.out.println("Your city and state : " + city);
        System.out.println("Your address : " + address);
    }

}
