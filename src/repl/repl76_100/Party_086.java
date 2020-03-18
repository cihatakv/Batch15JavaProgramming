package repl.repl76_100;

import java.util.Scanner;

public class Party_086 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // your code
        // ------------------------------------------

        String name;
        String yesNo;
        String list = "Guest's list: ";

        do {
            System.out.println("Please enter guest name:");
            name = input.nextLine();
            list += name + ", ";
            System.out.println("Do you want to enter new guest name:");
            yesNo = input.nextLine();
        } while (yesNo.equals("yes"));

        list = list.substring(0, list.length()-2);
        System.out.println(list);




    }
}
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
 */