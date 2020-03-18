package day27;

import java.util.Arrays;

public class ArrayTask02 {
    public static void main(String[] args) {
        /*
        return the max number from an array without sort method
         */
        int[] nums = {100, 10000, 9999, 8888, 1231, 2345};

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        System.out.println("max = " + max);

        int secondMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max)
                continue;
            else if (nums[i] > secondMax)
                secondMax = nums[i];
        }

        System.out.println("secondMax = " + secondMax);
    }
}
