package day19;

import java.util.Scanner;

public class HomeWorkSumAskUSerwithinTheRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Starting one: ");
        int starting = scan.nextInt();
        System.out.println("Enter Starting one: ");
        int ending = scan.nextInt();
        int sum = 0;
        for (int i = starting; i <= ending; i++)
            sum += i;

        System.out.println("Sum : " + sum);
    }
}
