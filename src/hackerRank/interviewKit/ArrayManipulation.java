package hackerRank.interviewKit;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 5;
        int y = 3;
        int a;
        int b;
        int k;

        int[][] arr = new int[3][10];

        for (int i = 0; i < 3; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            k = scan.nextInt();
            for (int j = a - 1; j < b; j++) {
                arr[i][j] += k;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }


    }
}
