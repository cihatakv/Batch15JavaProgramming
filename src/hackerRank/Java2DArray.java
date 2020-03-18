package hackerRank;
// https://www.hackerrank.com/challenges/java-2d-array/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        Scanner scanner = new Scanner(System.in);


//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }
//        scanner.close();

        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 6; c++) {
                arr[r][c] = scanner.nextInt();
            }
        }


    }
}

