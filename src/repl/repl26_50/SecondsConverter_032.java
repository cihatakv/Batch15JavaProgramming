package repl.repl26_50;

import java.util.Scanner;

public class SecondsConverter_032 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds, remainder;
        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();
        hours = inputSeconds / 3600;
        inputSeconds = inputSeconds % 3600;
        minutes = inputSeconds / 60 ;
        inputSeconds %= 60;
        seconds = inputSeconds;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds" ); //1 hours, 1 minutes, and 35 seconds

        /*
        Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
         */
    }
}
