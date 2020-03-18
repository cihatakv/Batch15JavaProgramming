package repl.repl26_50;

import java.util.Scanner;

public class GiftCard_035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        if (item.equals("Smartphone"))
            System.out.println("Sorry, not enough funds on your gift card!");
        else if (item.equals("Laptop"))
            System.out.println("Sorry, not enough funds on your gift card!");
        else if (item.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 15) + "$");
        }
        else if (item.equals("USB cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-10) + "$");
        }
        else if (item.equals("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-30) + "$");
        }
        else if (item.equals("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-50) + "$");
        }
        else if (item.equals("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-25) + "$");
        }
        else if (item.equals("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-5) + "$");
        }
        else if (item.equals("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-60) + "$");
        }
        else if (item.equals("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-40) + "$");
        }
        else
            System.out.println("Invalid item!");


        /*
        Let's say I've got a 100$ gift card and you want to buy something in your online store .
        Write a program that will help me to buy something and display leftover balance after purchase.
        If item is not in the list, display message: "Invalid item!". If price is more than 100$, display message:
        "Sorry, not enough funds on your gift card!".
        Hint
        Use if/ else if / else
        CODE EXAMPLE:
        Example #1
        input: Hat
        output: Thank you for your purchase!
        output: Your current balance is: 75$

        Example #2
        input: Pants
        output: Thank you for your purchase!
        output: Your current balance is: 50$

        Example #3
        input: Laptop
        output: Sorry, not enough funds on your gift card!

        Example #4
        input: Cupcake
        output: Invalid item!
         */
    }
}
