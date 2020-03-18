package repl.repl76_100;

import java.util.Scanner;

public class WithoutX_xs_079 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int first = 0;
        int last = word.length();
        if (word.charAt(0) == 'x' || word.charAt(0) == 'X')
            first = 1;
        if (word.charAt(last - 1 ) == 'x' || word.charAt(last - 1) == 'X')
            last--;
        System.out.println(word.substring(first,last));
        }
    }

