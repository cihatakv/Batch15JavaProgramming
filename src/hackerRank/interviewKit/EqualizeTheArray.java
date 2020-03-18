package hackerRank.interviewKit;

import java.util.Arrays;
import java.util.Scanner;

public class EqualizeTheArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeOfArr = scan.nextInt();
        int[] arr = new int[sizeOfArr];

        for (int i = 0; i < sizeOfArr; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max = 0;
        for (int i = 0; i < sizeOfArr; i++) {
            int cnt = 0;
            for (int j = 0; j < sizeOfArr; j++) {
                if (arr[i] == arr[j])
                    cnt++;
            }
            if (cnt > max) {
                max = cnt;
            }
        }


        System.out.println("Minimum # of Deletion is " + (arr.length - max));

    }
}
