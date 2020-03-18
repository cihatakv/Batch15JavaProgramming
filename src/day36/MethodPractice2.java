package day36;

import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {
        long[] myLongArray = {6L, 11L, 44L, 32L, 65L};
        Long[] myArray = {6L, 11L, 44L, 32L, 65L};

        System.out.println("Before swap myLongArray = " + Arrays.toString(myLongArray));

        swapFirstAndLastValue(myLongArray);
        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("After swap myLongArray = " + Arrays.toString(myLongArray));
    }

    /**
     * Swap first and last value of long array
     *
     * @param nums
     */
    public static void swapFirstAndLastValue(long[] nums) {
        long temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        System.out.println(Arrays.toString(nums));
    }
}
