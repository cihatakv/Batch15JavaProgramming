package day09;

import java.util.Scanner;

public class EvenOddFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int myNumber = scan.nextInt();

        int remainder = myNumber % 2;

        if (remainder == 0)
            System.out.println("Your number is EVEN");
        else
            System.out.println("Your number is ODD");

    }

}
