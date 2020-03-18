package repl.repl101_125;

import java.util.Scanner;

public class ArraysSplitEmail_119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();




        //Write your code below
        if (email.contains("@") && !email.substring(email.indexOf('@')+1).contains("@")){
            String[] split = email.split("@");
            System.out.println("Email id: " + split[0]);
            System.out.println("Email domain: " + split[1]);

        }
        else
            System.out.println("invalid email");


    }
}
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
 */