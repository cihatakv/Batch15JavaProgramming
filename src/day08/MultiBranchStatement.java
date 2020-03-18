package day08;

import java.util.Scanner;

public class MultiBranchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentSpeed = scan.nextInt();
        if (currentSpeed > 70 )
            System.out.println("You are speeding more than 70 --POINTS TAKEN");
        else if ( currentSpeed > 60 )
            System.out.println("Your speed is less than or equal to 70 but more than 60");
        else
            System.out.println("Keep Driving you are good");
    }
}
