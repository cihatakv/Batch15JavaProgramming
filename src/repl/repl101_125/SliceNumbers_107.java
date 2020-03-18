package repl.repl101_125;

import java.util.Scanner;

public class SliceNumbers_107 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = scan.nextInt();
        String reverseNum = "";

        while (true){
            reverseNum = num%10 + reverseNum;
            num /=10;
            if (num == 0)
                break;
        }
        for (int i = 0; i < reverseNum.length(); i++)
            System.out.println(reverseNum.charAt(i));
    }
}
/*
In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8

Use / and % operators

 */