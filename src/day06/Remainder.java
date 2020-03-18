package day06;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the whole minutes ");
        int wholeMinute = scan.nextInt();

        int hour = wholeMinute / 60;
        int minute = wholeMinute % 60;
        System.out.println("in " + wholeMinute + ", there are " + hour + " hours and " + minute + " minutes");

    }
}
