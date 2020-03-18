package repl.repl151_175;

import java.util.Scanner;

public class Methods13VerifyDataTypes_158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numStr = scan.next();
        printDataTypes(numStr);
    }

    public static void printDataTypes(String numStr) {
        long num = 0;
        try {
            num = Long.valueOf(numStr);
            System.out.println(num + " can be fitted in:");
            if (num >= -128 && num <= 127) {
                System.out.println("* byte");
            }
            //WRITE YOUR CODE HERE
            if (num >= Short.MIN_VALUE && num < Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (num >= Integer.MIN_VALUE && num < Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (num >= Long.MIN_VALUE && num < Long.MAX_VALUE) {
                System.out.println("* long");
            }


            //DO NOT CHANGE
        } catch (Exception e) {
            System.out.println(numStr + " can't be fitted anywhere.");
        }
    }
}
