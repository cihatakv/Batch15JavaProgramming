package repl.repl76_100;

import java.util.Scanner;

public class WithoutX_x_WithLoop_079 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //int index = word.length() - 1;
        String newWordWithoutX = "";
        int i = 0;
        while (i < word.length()){
            if (word.charAt(i) != 'x' && word.charAt(i) != 'X')
                newWordWithoutX += word.charAt(i) + "";
            i++;
        }
        System.out.println(newWordWithoutX);
    }
}
