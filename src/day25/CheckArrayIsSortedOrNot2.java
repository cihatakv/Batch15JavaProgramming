package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {
    public static void main(String[] args) {
        int[] nums = {13, 31, 8, 5, 21, 2};
        // int[] nums = {1,2,3,4,5,6};

        boolean isSortedAlready = true;
        System.out.println("Nums2 " + Arrays.toString(nums));

        for (int i = 0; i < nums.length - 1; i++) {
            // System.out.println(nums[i] + " " + nums[i + 1]);
            // pick first item and compare with second item
            System.out.println("Is " + nums[i] + " less than " + nums[i + 1] + "? " + (nums[i] < nums[i + 1]));
            if (! (nums[i] < nums[i + 1])) {
                System.out.println("ARRAY IS NOT SORTED, NO NEED TO CHECK THE REST");
                isSortedAlready = false;
                break;
            }
        }
        if (isSortedAlready)
            System.out.println("ARRAY IS ALREADY SORTED");


    }
}
