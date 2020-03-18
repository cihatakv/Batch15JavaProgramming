package repl;

import java.util.Scanner;

public class TernaryOperator1_060 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE
        String str1 = String.valueOf(x);

        str1 = x < 0 ? String.valueOf(x):x < 5 ? "-" + String.valueOf(x):String.valueOf(x);

        System.out.println(str1);


    }
}

/*
Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:
Display x if x is greater than or equal to 5
Display -x if x is less than 5

DO NOT USE IF STATEMENT or SWITCH CASE
 */