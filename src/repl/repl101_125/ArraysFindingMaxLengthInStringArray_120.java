package repl.repl101_125;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFindingMaxLengthInStringArray_120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }

        //write your code below

        int max = words[0].length();
        int maxIndex = 0;
        for (int i = 0; i < 5; i++) {
            if (words[i].length() > max){
                max = words[i].length();
                maxIndex = i;
            }
        }
        System.out.println(words[maxIndex]);

    }
}
/*
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */