package repl.repl26_50;

import java.util.Scanner;

public class VideoGameCoupons037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coupon;
        System.out.println("Enter number of coupons:");
        coupon = scan.nextInt();
        int numberOfCandies;
        int numberOfGumballs;
        if (coupon <= 2)
            System.out.println("Not enough coupons");
        else {
            numberOfCandies = coupon / 10;
            numberOfGumballs = (coupon % 10) / 3;
            System.out.println("Number of Candies: " + numberOfCandies);
            System.out.println("Number of Gumballs: " + numberOfGumballs);
        }
    }
}
/*
Instructions from your teacher:
The video game machines at your local arcade output coupons according to
how well you play the game. You can redeem 10 coupons for a candy bar or 3
coupons for a gumball. You prefer candy bars to gumballs. Write a program that
defines a variable initially assigned to the number of coupons you win. Next,
the program should output how many candy bars and gumballs you can get if
you spend all of your coupons on candy bars first, and any remaining coupons
on gumballs.

if you the coupons are not enough for any redeem, display message:
"Not enough coupons"


Example1:

Display prompt: "Enter number of coupons:"
13
Display prompt: "Number of Candies: 1"
Display prompt: "Number of Gumballs: 1"

Example2:

Display prompt: "Enter number of coupons:"
23
Display prompt: "Number of Candies: 2"
Display prompt: "Number of Gumballs: 1"

Example3:

Display prompt: "Enter number of coupons:"
2
Display prompt: "Not enough coupons"
 */