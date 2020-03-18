package day31;

public class Calculator {
    public static void main(String[] args) {

        // create a static method that add
        // it accept two numbers and print the result of addition

        add3Numbers(6, 23);
        subtract(15, 5);
        multiply(2, 6);
        divide(9, 3);
        add3Numbers(5, 6, 7);

    }

    public static void add3Numbers(int num1, int num2) {
        System.out.println("Addition result is " + (num1 + num2));
    }

    public static void add3Numbers(int num1, int num2, int num3) {
        System.out.println("Addition result is " + (num1 + num2 + num3));
    }

    public static void subtract(int num1, int num2) {
        System.out.println("Subtraction result is " + (num1 - num2));
    }

    public static void multiply(int num1, int num2) {
        System.out.println("Multiplication result is " + (num1 * num2));
    }

    public static void divide(int num1, int num2) {
        System.out.println("Division result is " + (num1 / num2));
    }


}
