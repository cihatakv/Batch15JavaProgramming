package exercise.codingBat;

import java.util.Arrays;

public class CodingBatArray2<fizzArray> {
    public static void main(String[] args) {
        int a = 5;
        String[] fizzArray = fizzArray2(a);
        System.out.println(Arrays.toString(fizzArray));
        System.out.println("=========================");
        System.out.println("01" + isEverywhere(new int[]{1, 2, 1, 3}, 1));
        System.out.println("02" + isEverywhere(new int[]{1, 2, 1, 3}, 2));
        System.out.println("03" + isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
        System.out.println("04" + isEverywhere(new int[]{2, 1, 2, 1}, 1));
        System.out.println("05" + isEverywhere(new int[]{2, 1, 2, 1}, 2));
        System.out.println("06" + isEverywhere(new int[]{2, 1, 2, 3, 1}, 2));
        System.out.println("07" + isEverywhere(new int[]{3, 1}, 3));
        System.out.println("08" + isEverywhere(new int[]{3, 1}, 2));
        System.out.println("09" + isEverywhere(new int[]{3}, 1));
        System.out.println("10" + isEverywhere(new int[]{}, 1));
        System.out.println("11" + isEverywhere(new int[]{1, 2, 1, 2, 3, 2, 5}, 2));
        System.out.println("12" + isEverywhere(new int[]{1, 2, 1, 1, 1, 2}, 2));
        System.out.println("13" + isEverywhere(new int[]{2, 1, 2, 1, 1, 2}, 2));
        System.out.println("14" + isEverywhere(new int[]{2, 1, 2, 2, 2, 1, 1, 2}, 2));
        System.out.println("15" + isEverywhere(new int[]{2, 1, 2, 2, 2, 1, 2, 1}, 2));
        System.out.println("16" + isEverywhere(new int[]{2, 1, 2, 1, 2}, 2));
    }

    // either24([4, 4, 1, 2, 2]) → false
    // either24([1, 2, 3, 4]) → false
    //
    //
    public static boolean either24(int[] nums) {
        boolean either24 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                either24 = true;
                if (nums[i] == 4 && nums[i + 1] != 4) {
                    either24 = true;
                } else if (nums[i] == 4 && nums[i + 1] == 4) {
                    return false;
                }
            }
        }
        return either24;
    }


    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val)
                return false;
        }
        return true;
    }

    public static boolean no14(int[] nums) {
        int cnt1 = 0;
        int cnt4 = 0;
        boolean is14 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                cnt1++;
            else if (nums[i] == 4)
                cnt4++;
            else
                continue;
        }
        if (cnt1 > 0 && cnt4 == 0)
            is14 = true;
        else if (cnt1 == 0 && cnt4 > 0)
            is14 = true;
        return is14;
    }

    public static String[] fizzArray2(int n) {
        String[] fizzArray = new String[n];

        for (int i = 0; i < n; i++) {
            fizzArray[i] = String.valueOf(i);
        }
        return fizzArray;
    }

}
