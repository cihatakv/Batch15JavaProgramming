package repl.repl51_75;

import java.util.Scanner;

public class Week_057 {
    public static void main(String[] args) {

        //Step 1. Create object of Scanner class

        Scanner scanner = new Scanner(System.in);

        //Step 2. Create and intitialize in variable day. Use scanner.nextInt() to intitialize.

        int day;

        //Step 3. Write an if statement

        for (int i = 1; i < 6; i++) {
            day = scanner.nextInt();
            if (day == 1)
                System.out.println("It's a Monday!");
            else if (day == 2)
                System.out.println("It's a Tuesday!");
            else if (day == 3)
                System.out.println("It's a Wednesday!");
            else if (day == 4)
                System.out.println("It's a Thursday!");
            else if (day == 5)
                System.out.println("It's a Friday!");
            else if (day == 6)
                System.out.println("It's a Saturday!");
            else if (day == 7)
                System.out.println("It's a Sunday!");
            else
                System.out.println("There is no such a day!");
        }
    }
}
