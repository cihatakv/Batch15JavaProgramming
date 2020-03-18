package hackerRank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int total = a;
            for (int j = 0; j < n; j++) {
                total += Math.pow(2, j) * b;
                System.out.print(total + " ");
            }
            System.out.println();
        }
        // in.close();
    }
}
// 2 0 2 10 5 3 5
//2 6 14 30 62 126 254 510 1022 2046
//
//8 14 26 50 98