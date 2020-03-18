package day08;

import java.util.Scanner;

public class WamUpTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int yourFavouriteNumber;
        int myFavouriteNumber = 13;

        for (int i = 5; i > 0; i--) {

            System.out.println("Please guess my favourite Number: ");
            yourFavouriteNumber = scan.nextInt();
            if (myFavouriteNumber == yourFavouriteNumber) {
                System.out.println("BINGO!!");
                i = 0;
            } else {
                System.out.println("Please try again");
                if (i > 1)
                    System.out.println("You have only " + (i - 1) + " guess left!");
            }
        }
    }
}
