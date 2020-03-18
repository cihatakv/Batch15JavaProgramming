package day31;

import java.util.Scanner;

public class Calculator_V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter num1");
        int num1 = scan.nextInt();
        System.out.println("Please enter num2");
        int num2 = scan.nextInt();
        System.out.println("Please the operation +, -, * or /");
        char operator = scan.next().charAt(0);
        calculate(num1, num2, operator);
        System.out.println("=================");
        // calculate(15,5,'-');
    }
    public static void calculate(int num1, int num2, char operator){
        switch (operator){
            case '+':
                System.out.println("Addition result is " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction result is " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication result is " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division result is " + (num1 / num2));
                break;
            default:
                System.out.println("INVALID OPERATOR");
        }
    }
}
