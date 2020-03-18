package javaInterviewCodingTasksInCanvas;

import java.util.Scanner;

// Array -- Find Minimum
// Write a method that can find the maximum number from an int Array
public class ArrayFindMinimum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array?");
        int size = scan.nextInt();
        int arr[] = new int[size];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int each : arr) {
            System.out.println("Please enter number for array element: ");
            each = scan.nextInt();
            if (each < min)
                min = each;
            if (each > max)
                max = each;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
