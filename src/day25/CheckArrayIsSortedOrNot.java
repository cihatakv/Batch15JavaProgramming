package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] nums = {13, 31, 8, 5, 21, 2};
        int[] nums2 = nums;
        System.out.println("Nums2 " + Arrays.toString(nums2));
        // storing the size of an array into a variable
        int numsItemCount = nums.length;
        // I want to copy the content of nums array into the new array

        // creating an array with same size as original array
        int[] numsCopy = new int[numsItemCount];

        for (int i = 0; i < numsItemCount; i++) {
            numsCopy[i] = nums[i];
        }
        System.out.println("Before sorting numsCopy = " + Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);
        System.out.println("Equal or not " + Arrays.equals(numsCopy, nums));

        System.out.println("After sorting numsCopy = " + Arrays.toString(numsCopy));



        // Check whether the array still have same content in same order after sorting

        if (Arrays.equals(nums, numsCopy))
            System.out.println("THIS ARRAY OS ALREADY SORTED");
        else
            System.out.println("THIS ARRAY IS NOT ALREADY SORTED");

    }
}
