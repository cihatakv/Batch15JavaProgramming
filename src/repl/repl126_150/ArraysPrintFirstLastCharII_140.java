package repl.repl126_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintFirstLastCharII_140 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(),
                input.nextLine(), input.nextLine(), input.nextLine()};

        //TODO: Write your code below

        int i = 0;
        String[] newWords = new String[words.length];
        for (String eachWord : words) {
            newWords[i] = eachWord.charAt(0) + "" + eachWord.charAt(eachWord.length() - 1);
            i++;
        }
        System.out.println(Arrays.toString(newWords));


    }
}
/*
Given a String array words,
iterate through each word and print first and
last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
 */