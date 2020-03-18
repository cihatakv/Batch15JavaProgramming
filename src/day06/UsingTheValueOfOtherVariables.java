package day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {
        String yourOrder = "pizza";
        String myOrder = yourOrder;

        System.out.println("Your Order is " + yourOrder);
        System.out.println("My order is " + myOrder);

    }
}
