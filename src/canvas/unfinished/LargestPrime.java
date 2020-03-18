package canvas.unfinished;

public class LargestPrime {
    public static void main(String[] args) {
        // should return 7 since 7 is the largest prime (3 * 7 = 21)
        System.out.println(getLargestPrime(21));

        // should return 31 since 31 is the largest prime (7 * 31 = 217)
        System.out.println(getLargestPrime(217));

        // should return -1 since 0 does not have any prime numbers
        System.out.println(getLargestPrime(0));

        // should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        System.out.println(getLargestPrime(45));

        // should return -1 since the parameter is negative
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int number) {

        int divisor = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                divisor = i;
        }
        if (number < 0 || divisor == 1)
            return -1;
        return divisor;
    }
}
/*
    Write a method named getLargestPrime with one parameter of type int named number.

    If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.


    The method should calculate the largest prime factor of a given number and return it.


    EXAMPLE INPUT/OUTPUT:

    * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)

    * getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)

    * getLargestPrime (0); should return -1 since 0 does not have any prime numbers

    * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

    * getLargestPrime (-1); should return -1 since the parameter is negative


    HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

    NOTE: The method getLargestPrime should be defined as public static.
     */