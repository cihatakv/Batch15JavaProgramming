package day05;

import java.util.Scanner;

public class ShoppingListCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
    Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>

        Your grand total for this shopping is ????

    * */
        System.out.print("Please enter the price of tomato :");

        double tomatoPrice = scan.nextDouble();

        System.out.print("How many tomatoes do you have ?");

        int amountOfTomato = scan.nextInt();

        System.out.print("Please enter the price of potato :");

        double potatoPrice = scan.nextDouble();

        System.out.print("How many potatoes do you have ?");

        int amountOfPotato = scan.nextInt();

        System.out.print("Please enter the price of banana :");

        double bananaPrice = scan.nextDouble();

        System.out.print("How many bananas do you have ?");

        int amountOfBanana = scan.nextInt();

        System.out.println("You got " + amountOfTomato + " price is $" + tomatoPrice + " and total -->> $" + amountOfTomato * tomatoPrice);
        System.out.println("You got " + amountOfPotato + " price is $" + potatoPrice + " and total -->> $" + amountOfPotato * potatoPrice);
        System.out.println("You got " + amountOfBanana + " price is $" + bananaPrice + " and total -->> $" + amountOfBanana * bananaPrice);

    }
}
