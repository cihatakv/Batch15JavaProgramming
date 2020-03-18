package repl;

import java.util.Scanner;

public class TernaryOperator2_061 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();
        //WRITE YOUR CODE HERE
        String str = num1 > num2 ? String.valueOf(num1):String.valueOf(num2);
        System.out.println(str);






    }
}

/*
Write an expression using the conditional operator (? :)
that compares the values of the variables num1 and num2.
The result (that is the value) of this expression should
be the value of the larger of the two variables.
Larger value should be printed out.

 */