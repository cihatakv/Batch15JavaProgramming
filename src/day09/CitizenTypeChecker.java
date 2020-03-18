package day09;

import java.util.Scanner;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        String citizenType;
        System.out.println("Please enter the age: ");
        age = scan.nextInt();


        if (age > 65)
            citizenType = "Senior";
        else
            citizenType = "Not-Senior";

        System.out.println(citizenType);


        /*
        Create a variable called cityzenType as String
And create a variable with age
 If the age  is more than 65 , assign value of  cityzenType to Senior
 If not , assign value of  cityzenType to Not-Senior

Both tasks optionally use Scanner
         */
    }
}
