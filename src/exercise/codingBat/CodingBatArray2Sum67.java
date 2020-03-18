package exercise.codingBat;

public class CodingBatArray2Sum67 {
    public static int sum67(int[] nums) {
        int sum = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                i++;
                while (nums[i] != 7) {
                    i++;
                }
            } else
                sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] a1 = {1, 2, 2};
        int[] a2 = {1, 2, 2, 6, 99, 99, 7};
        int[] a3 = {1, 1, 6, 7, 2};
        int[] a4 = {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};
        int[] a5 = {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7};
        int[] a6 = {2, 7, 6, 2, 6, 7, 2, 7};
        int[] a7 = {2, 7, 6, 2, 6, 2, 7};
        int[] a8 = {1, 6, 7, 7};
        int[] a9 = {6, 7, 1, 6, 7, 7};
        int[] a10 = {6, 8, 1, 6, 7};
        int[] a11 = {};
        int[] a12 = {6, 7, 11};
        int[] a13 = {11, 6, 7, 11};
        int[] a14 = {2, 2, 6, 7, 7};

        System.out.println(sum67(a1));
        System.out.println(sum67(a2));
        System.out.println(sum67(a3));
        System.out.println(sum67(a4));
        System.out.println(sum67(a5));
        System.out.println(sum67(a6));
        System.out.println(sum67(a7));
        System.out.println(sum67(a8));
        System.out.println(sum67(a9));
        System.out.println(sum67(a10));
        System.out.println(sum67(a11));
        System.out.println(sum67(a12));
        System.out.println(sum67(a13));
        System.out.println(sum67(a14));

    }
}