package repl.repl51_75;

import java.util.Scanner;

public class PrintHalfTwice_069 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int halfLength = word.length()/2;
        System.out.print(word.substring(0, halfLength));
        System.out.print(word.substring(0, halfLength));
    }
}
