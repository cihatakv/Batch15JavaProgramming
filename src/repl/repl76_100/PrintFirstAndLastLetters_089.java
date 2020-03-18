package repl.repl76_100;

import java.util.Scanner;

public class PrintFirstAndLastLetters_089 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int l = word.length();

        System.out.print(word.charAt(0));
        System.out.print(word.charAt(l-1));

    }
}
