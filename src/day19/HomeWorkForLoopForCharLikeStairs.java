package day19;

import java.util.Scanner;

public class HomeWorkForLoopForCharLikeStairs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter starting letter: ");
        char starting = scan.nextLine().charAt(0);
        System.out.print("Please enter ending letter: ");
        char ending = scan.nextLine().charAt(0);

        String line = "";
        for (char i = starting; i <= ending; i++) {
            line += i;
            System.out.println(line + " ");
        }

    }
}
