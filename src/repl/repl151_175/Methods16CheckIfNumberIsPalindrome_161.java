package repl.repl151_175;

import java.util.Scanner;

public class Methods16CheckIfNumberIsPalindrome_161 {
    public static void main(String[] args) {

        int fibNum = fibonacciNumber(10);
        // System.out.println(fibonacciNumber(10));

//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        isPalindrome(num);
//        isPalindromee(num);
//        System.out.println("10th Fibonacci is " + fibonacciNumber(10));
    }


    public static int fibonacciNumber(int num) {
        // 1  2  3  4  5  6  7  8  9
        // 0, 1, 1, 2, 3, 5, 8, ....
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...

        int num1 = 0;
        int num2 = 1;
        int result = 0;

        System.out.println("0 1 1 2 3 5 8 13 21 34");
        System.out.print(num1 + " " + num2 + " ");


        for (int i = 3; i <= num; i++) {
            result = num1 + num2; // result = 1 num1 = 0 num2 = 1
            num1 = num2;          // num1 = 1
            num2 = result;        // num2 = 1  result = 1
            System.out.print(result + " ");
        }


//        for (int i = 3; i <= num; i++) {
//            result = num1 + num2;
//            num1 = num2;
//            num2 = result;
//        }

        return result;
    }

    //    public static void isPalindrome(int num){
//        //WRITE YOUR CODE HERE
//
//        String numStr = Integer.toString(num);
//        String reversedNum = "";
//        for (int i = numStr.length() - 1; i >=0; i--) {
//            reversedNum += numStr.charAt(i);
//        }
//        System.out.println(reversedNum.equals(numStr));
//    }
    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        int temp = num;
        int reversed = 0;
        while (temp > 0) {

            reversed *= 10;
            reversed += temp % 10;
            temp /= 10;

        }
        System.out.println("reversed = " + reversed);
        System.out.println(num == reversed);

    }

}
