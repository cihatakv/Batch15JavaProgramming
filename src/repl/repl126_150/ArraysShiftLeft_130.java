package repl.repl126_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysShiftLeft_130 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        for (int j = 0; j < size - 1; j++) {
            int temp = nums[j];
            nums[j] = nums[j + 1];
            nums[j + 1] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
