package day36;

import java.util.Arrays;

public class ReverseIntArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverseIntArray(arr);
    }

    // Optionally write a static void method to reverse an int array

    public static void reverseIntArray(int[] nums) {

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(nums));

    }

}
