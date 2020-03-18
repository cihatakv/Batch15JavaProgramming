package repl.repl101_125;

import java.util.Scanner;

public class ArraysCountEvens_121 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below

        int count = 0;
        for (int eachNum : nums) {
            if (eachNum %2 == 0)
                count++;
        }
        System.out.println(count);

    }
}
/*
Given an array nums, calculate count of even numbers in nums (not their values!) and print out to console.

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
 */