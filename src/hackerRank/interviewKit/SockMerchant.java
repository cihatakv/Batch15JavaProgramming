package hackerRank.interviewKit;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int pair = 0;
        // Arrays.sort(ar);

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - 1 - i; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(ar));

        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                pair++;
                ar[i] = 0;
                ar[i + 1] = 0;
                i++;
            }
        }

        return pair;

    }

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int arItem = scanner.nextInt();
            arr[i] = arItem;
        }
        System.out.println(Arrays.toString(arr));
        int pair = sockMerchant(n, arr);
        System.out.println("pair = " + pair);


//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//
//        int result = sockMerchant(n, ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
