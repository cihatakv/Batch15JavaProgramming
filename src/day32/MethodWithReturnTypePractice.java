package day32;

public class MethodWithReturnTypePractice {
    public static double divide(double num1, double num2) {
        if (num2 == 0)
            return 0;
        else
            return num1 / num2;
    }

    public static void main(String[] args) {
        double result = divide(10, 0);
        System.out.println("result = " + result);
    }
}
