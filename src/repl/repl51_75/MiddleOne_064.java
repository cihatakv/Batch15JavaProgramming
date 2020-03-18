package repl.repl51_75;

import java.util.Scanner;

public class MiddleOne_064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int length = word.length();
        if (length == 1)
            System.out.println(word+word+word);
        else if (length == 2)
            System.out.println(word+word);
        else if (length %2 == 1){
            System.out.println(word.charAt(length/2));
        }
        else
//          System.out.println();
            System.out.println(word.substring(word.length()/2 - 1, word.length()/2 + 1));
        }
}
