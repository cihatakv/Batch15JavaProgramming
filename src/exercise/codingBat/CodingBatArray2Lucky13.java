package exercise.codingBat;

public class CodingBatArray2Lucky13 {
    public static void main(String[] args) {

        int s = Integer.parseInt("1453");
        System.out.println("s = " + s);
    }

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
