package day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of your array");
        int length = scan.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter your number " + (i+1));
            numbers[i] = scan.nextInt();
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Your number" + (i+1) + " is " + numbers[i]);

        }
    }
}
