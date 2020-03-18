package javaInterviewCodingTasksInCanvas;

import java.util.Scanner;

// Array -- Find Maximum
// Write a method that can find the maximum number from an int Array
public class ArrayFindMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array?");
        int size = scan.nextInt();
        int arr[] = new int[size];

        int max = arr[0];
        for (int each : arr) {
            System.out.println("Please enter number for array element: ");
            each = scan.nextInt();
            if (each > max)
                max = each;
        }
        System.out.println("max = " + max);
    }
}
