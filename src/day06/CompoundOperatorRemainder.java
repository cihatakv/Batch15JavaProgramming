package day06;

public class CompoundOperatorRemainder {
    public static void main(String[] args) {

        int bankBalance = 1140 ;

        System.out.println(" I have spent half of it: " + bankBalance);

        bankBalance /= 2; // bankBalance = bankBalance / 2 ;

        System.out.println("Now balance is " + bankBalance);

        // I want to device the balance by 500 and keep the remainder in my pocket

        bankBalance = bankBalance % 500 ;

        System.out.println("Remainder is : " + bankBalance);

    }

}
