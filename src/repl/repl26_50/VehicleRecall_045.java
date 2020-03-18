package repl.repl26_50;

import java.util.Scanner;

public class VehicleRecall_045 {
    public static void main(String[] args) {
                //WRITE YOUR CODE HERE
                Scanner scan = new Scanner(System.in);
                int vehicleYear;

                System.out.println("Enter vehicle's year:");
                vehicleYear = scan.nextInt();

                if (vehicleYear > 1994 && vehicleYear < 1999 | vehicleYear > 2000 && vehicleYear < 2003 | vehicleYear > 2003 && vehicleYear < 2007 | vehicleYear > 2014 && vehicleYear < 2018)
                    System.out.println("Your vehicle needs to be recalled!");
                else
                    System.out.println("Your vehicle is fine, enjoy!");
            }
        }


