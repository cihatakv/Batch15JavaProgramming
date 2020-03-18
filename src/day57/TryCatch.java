package day57;

public class TryCatch {

    public static void main(String[] args) {

        System.out.println("BEFORE TRY CATCH");

        try {
            System.out.println("before catch");
            int result = 10 / 0;
            System.out.println("Calculated?");
        } catch (ArithmeticException e) {
            System.out.println("Exception happened, and was caught!");
        }

        System.out.println("AFTER TRY CATCH");


        try {
            System.out.println("In second Try block");
            String str = "java is fun!";
            System.out.println("str.charAt(0) = " + str.charAt(0));
            System.out.println("str.charAt(30) = " + str.charAt(30));
            System.out.println("str.charAt(1) = " + str.charAt(1));
        } catch (StringIndexOutOfBoundsException ex) {   // (Exception ex) { // (Throwable ex) {
            System.out.println("Exception happened in try block and caught");
        }

        System.out.println("after Second try catch");


    }
}
