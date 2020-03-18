package day07;

import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args) {
        String firstName, lastName, company, email;

        Scanner scan = new Scanner(System.in);

        firstName = scan.nextLine();
        lastName = scan.nextLine();
        company = scan.nextLine();

        email = firstName + "_" + lastName + "@" + company + ".com";

        System.out.println(email);


        // create a class called EmailBuilder with main method

        // create 3 String variable for first name  last name , company
        // create another variable for email
        // create email in this format firstName_lastName@company.com

        // print out the result as , my name is <your full name> and I work for <company> and my email is <email>
    }
}
