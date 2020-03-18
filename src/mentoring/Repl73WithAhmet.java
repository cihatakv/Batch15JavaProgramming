package mentoring;

import java.util.Scanner;

public class Repl73WithAhmet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
//
//        System.out.println("First Logic");
//
//        System.out.print(word.charAt(word.length() / 2 - 1)); // 3 - 1   // 3 + 0 - 1
//        System.out.print(word.charAt(word.length() / 2 + 0)); // 3 + 0   // 3 + 1 - 1
//        System.out.print(word.charAt(word.length() / 2 + 1)); // 3 + 1   // 3 + 2 - 1
//
//        System.out.println("\nSecond Logic with For Loop" );
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print(word.charAt(word.length() / 2 - 1 + i));
//        }
//
//        System.out.println("\nThird Logic with Substring" );
//        // abcde
//        // 01234

        if (word.length() % 2 == 0 && word.length() < 5) {
            System.out.println("invalid");
        } else {
            System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 2));
        }
    }
}

/*
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

 0123456
"qwertyu"

word.length() / 2 - 1
word.length() / 2
word.length() / 2 + 1


fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */
