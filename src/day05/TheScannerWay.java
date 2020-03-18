package day05;

import java.util.*;

public class TheScannerWay {
    public static void main(String[] args) {
        // ask user for name
        // and capture the result
        // print your name is
        // ask user for birth year
        // and capture the result
        // print the age !!
        // ask user for height
        // and capture the result
        // print the height
        // create the scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name : ");

        String name = scan.next();
        // boolean name = scan.nextBoolean();
        System.out.println("My name is " + name);

        System.out.println("What is your birth year : ");

        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;
        System.out.println("Your age is : " + age);

        System.out.println("What is your height : ");
        double height = scan.nextDouble();
        System.out.println("Your height is " + height);













    }

}
