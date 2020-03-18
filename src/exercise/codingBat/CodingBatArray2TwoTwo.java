package exercise.codingBat;

public class CodingBatArray2TwoTwo {
    public static boolean twoTwo(int[] nums) {
        boolean is22 = false;
        for (int num : nums) {
            if (num != 2)
                is22 = true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2) {
                if (nums[i + 1] == 2) {
                    is22 = true;
                    i++;
                } else {
                    is22 = false;
                }
            } else {
                is22 = true;
            }
        }
        if (nums[nums.length - 2] != 2 && nums[nums.length - 1] == 2)
            is22 = false;
        return is22;
    }

    public static void main(String[] args) {

    }

}
