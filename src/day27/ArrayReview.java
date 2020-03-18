package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter am int number: ");
            numbers[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));


        // Arrays.sort(variableName): sorts the array in ascending order
        Arrays.sort(numbers);
        int largestNumber = numbers[numbers.length - 1];
        int minNumber = numbers[0];
        System.out.println("Largest number is: " + largestNumber);
        System.out.println("Minimum number is: " + minNumber);


    }
}
