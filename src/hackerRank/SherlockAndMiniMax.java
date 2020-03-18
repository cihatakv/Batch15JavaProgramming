package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndMiniMax {
    // Complete the sherlockAndMinimax function below.
    static int sherlockAndMinimax(int[] arr, int p, int q) {

        int sumMin = 0;
        for (int i = p; i <= q; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if (Math.abs(arr[j] - i) < min) {
                    min = Math.abs(arr[j] - i);
                }
            }
            sumMin += min;
        }
        return sumMin;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int a[] = {12, 10, 50, 24, 40};
        System.out.println("sherlockAndMinimax(a, 9, 16) = " + sherlockAndMinimax(a, 9, 16));


//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }
//
//        String[] pq = scanner.nextLine().split(" ");
//
//        int p = Integer.parseInt(pq[0]);
//
//        int q = Integer.parseInt(pq[1]);
//
//        int result = sherlockAndMinimax(arr, p, q);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
