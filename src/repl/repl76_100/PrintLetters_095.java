package repl.repl76_100;

import java.util.Scanner;

public class PrintLetters_095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        for (char iChar = start; iChar <= end; iChar++){
            System.out.print(iChar);
        }
    }
}
