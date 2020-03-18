package repl.repl151_175;

import java.util.Arrays;
import java.util.Scanner;

public class Methods14PrintUniqueNumbers_159 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Size");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the element");
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    // Write a void method printUniqueNumbers that will print unique numbers from an array of ints.
    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] != nums[i + 1])
                System.out.println(nums[i]);
//            else
//                i++;
        }
        if (nums[nums.length - 2] != nums[nums.length - 1])
            System.out.println(nums[nums.length - 1]);
    }
}
/**
 * Example:
 * input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
 * output:
 * 2
 * 9
 * 34
 */