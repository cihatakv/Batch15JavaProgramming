package day32;

public class MethodWithReturnIntro {

    public static String giveMeMyName() {

        return "John";

    }

    public static int doubleTheNumber(int num) {

        System.out.println("Here is the number that I am going to double");

        return num * 2;

    }

    public static int add2Numbers(int num1, int num2) {

        return num1 + num2;
    }

    public static void main(String[] args) {

        String myName = giveMeMyName();
        System.out.println("myName is " + myName);

        int doubledNumber = doubleTheNumber(5);
        System.out.println("doubledNumber = " + doubledNumber);

        int sum = add2Numbers(3, 5);
        System.out.println("sum = " + sum);
    }
}
