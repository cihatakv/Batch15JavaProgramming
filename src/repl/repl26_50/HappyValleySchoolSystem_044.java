package repl.repl26_50;

import java.util.Scanner;

public class HappyValleySchoolSystem_044 {
    public static void main(String[] args) {
            //DO NOT CHANGE
            Scanner scan = new Scanner(System.in);
            //WRITE YOUR CODE HERE
            int age;
            System.out.println("Enter age:");
            age = scan.nextInt();
            if (age < 2)
                System.out.println("ineligible");
            else if (age == 2)
                System.out.println("toddler");
            else if (age > 2 && age < 6)
                System.out.println("early childhood");
            else if (age > 5 && age < 8)
                System.out.println("young reader");
            else if (age > 7 && age < 11)
                System.out.println("elementary");
            else if (age > 10 && age < 13)
                System.out.println("middle");
            else if (age == 13)
                System.out.println("impossible");
            else if (age > 13 && age < 17)
                System.out.println("high school");
            else if (age > 16 && age < 19)
                System.out.println("scholar");
            else
                System.out.println("ineligible");
        }
    }
