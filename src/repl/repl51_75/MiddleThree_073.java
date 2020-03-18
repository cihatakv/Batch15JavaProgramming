package repl.repl51_75;

import java.util.Scanner;

public class MiddleThree_073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int l = word.length();
        if (l %2 == 1 && l > 4)
            System.out.println(word.substring(l/2-1, l/2 + 2));
        else
            System.out.println("invalid");
    }
}
