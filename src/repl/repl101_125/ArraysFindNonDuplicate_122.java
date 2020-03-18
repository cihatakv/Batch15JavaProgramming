package repl.repl101_125;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFindNonDuplicate_122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        Arrays.sort(nums);
        if (nums[nums.length - 1] != nums[nums.length - 2]){
            System.out.println(nums[nums.length - 1]);
        } else {
            for (int i = 0; i < nums.length - 2; i += 2) {
                if (nums[i] == nums[i + 1]){
                    continue;
                }
                else {
                    System.out.println(nums[i]);
                    break;
                }
            }
        }

    }
}
/*
Given an array nums with 7 integers every element is repeated twice -
except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */