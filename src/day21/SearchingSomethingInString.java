package day21;

import java.util.Scanner;

public class SearchingSomethingInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the sentence: ");
        String sentence = scan.nextLine();
        System.out.print("Please enter the word: ");
        String word = scan.nextLine();
        int charIndexSentence = sentence.length() - 1;
        int charIndexWord = word.length() - 1;
        int count = 0;
        for (int i = 0; i < charIndexSentence - charIndexWord + 1; i++) {
            if (sentence.substring(i, i + charIndexWord + 1).equalsIgnoreCase(word)) {
                count++;
                System.out.println("The index of " + word + " " + i);
            }

        }
        System.out.println("count = " + count);


    }
}
