package repl.repl26_50;

import java.util.Scanner;

public class VendingMachine_034 {
    public static void main(String[] args) {
        int itemPrice;
        int quarters, dimes, nickels, remainder;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        itemPrice = scan.nextInt();

        if(itemPrice > 24 && itemPrice < 101){
            if (itemPrice % 5 == 0) {
                remainder = 100 - itemPrice;
                quarters = remainder / 25;
                remainder %= 25;
                dimes = remainder / 10;
                remainder %= 10;
                nickels = remainder / 5;
                System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels."); // Since the item price was entered 95, change is 1 nickels
            }
            else
                System.out.println("Invalid price!");

        }
        else
            System.out.println("Invalid price!");





        /*
        Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

Program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behaviour:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickels

Negative behaviour:

If itemPrice is less than 25 or more than 100 cents, then display error message:
Invalid price!

If itemPrice is not divisible by 5, then also display error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.
         */
    }
}
