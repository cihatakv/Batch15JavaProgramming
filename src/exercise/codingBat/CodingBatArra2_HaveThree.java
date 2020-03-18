package exercise.codingBat;

public class CodingBatArra2_HaveThree {
    public static void main(String[] args) {
        System.out.println("08 " + haveThree(new int[]{3, 1, 3, 1, 3}));
        System.out.println("09 " + haveThree(new int[]{3, 1, 3, 3}));
        System.out.println("10 " + haveThree(new int[]{3, 4, 3, 3, 4}));
        System.out.println("11 " + haveThree(new int[]{1, 3, 1, 3, 1, 2}));
        System.out.println("12 " + haveThree(new int[]{1, 3, 1, 3, 1, 3}));
        System.out.println("13 " + haveThree(new int[]{1, 3, 3, 1, 3}));
        System.out.println("14 " + haveThree(new int[]{1, 3, 1, 3, 1, 3, 4, 3}));
        System.out.println("15 " + haveThree(new int[]{3, 4, 3, 4, 3, 4, 4}));
        System.out.println("================");

        System.out.println("1 " + has77(new int[]{2, 3, 2, 7, 1, 7, 1, 7, 1, 7, 1, 7, 7, 1, 7}));

    }

    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 7 && nums[i + 1] == 7)
                return true;

            if (i <= nums.length - 3 && nums[i] == 7 && nums[i + 2] == 7)
                return true;
        }
        return false;
    }

    public static boolean haveThree(int[] nums) {
        int cnt = 0;
        if (nums.length > 0 && nums[0] == 3)
            cnt++;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 3 && nums[i] == 3) {
                return false;
            }
            if (nums[i] == 3)
                cnt++;

        }
        return cnt == 3;
    }


}
