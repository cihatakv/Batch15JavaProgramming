package hackerRank.interviewKit;

import java.util.Scanner;

public class JumpingOnTheClouds {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = scan.nextInt();
        }

        int jump = 0;
        int i;
        for (i = 0; i < n - 2; i++) {
            if (c[i + 2] == 0) {
                jump++;
                i++;
            } else {
                jump++;
            }
        }

        if (i == n - 2)
            jump++;
        System.out.println("i = " + i);
        System.out.println("jump = " + jump);

    }

}
