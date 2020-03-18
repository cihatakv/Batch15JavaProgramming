package repl.repl126_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFrontPiece_139 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE


        if (size < 2) {
            int[] newArr = new int[size];
            for (int i = 0; i < size; i++) {
                newArr[i] = num[i];
            }
            System.out.println(Arrays.toString(newArr));
        } else {
            int[] newArr = new int[2];
            for (int i = 0; i < 2; i++) {
                newArr[i] = num[i];
            }
            System.out.println(Arrays.toString(newArr));
        }


    }
}
/*
Given an int array of any length,
print a new array of its first 2 elements.
If the array is smaller than length 2,
use whatever elements are present.

Example:
input 1, 2, 3
output: [1, 2]

Example:
input 1,
output: [1]
 */