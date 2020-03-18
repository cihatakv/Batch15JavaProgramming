package day58;

public class TryCatchFinally {
    public static void main(String[] args) {

        System.out.println("before try catch");

        try {
            System.out.println("Hello from try block");
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception happened and caught");
        }

        System.out.println("After try catch");


        try {
            System.out.println("Hello from try block");
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception happened and caught");
        } finally {
            System.out.println("Finally block. Runs if there is exception or no exception");
        }

        System.out.println("After try catch");

    }
}
