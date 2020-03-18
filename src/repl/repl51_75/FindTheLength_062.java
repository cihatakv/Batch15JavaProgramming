package repl;

import java.util.Scanner;

public class FindTheLength_062 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String str = scan.nextLine();
        System.out.println("Length is: " + str.length());

    }
}
/*
Write a program that will output length of the text (string).

Example:
Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"
 */