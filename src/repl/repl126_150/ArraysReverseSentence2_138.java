package repl.repl126_150;

import java.util.Scanner;

public class ArraysReverseSentence2_138 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String[] sentenceArr = sentence.split(" ");

        for (int i = sentenceArr.length - 1; i > 0; i--) {
            reversed += sentenceArr[i] + " ";
        }
        reversed += sentenceArr[0];

        //End your code here. do not modify below statement
        System.out.println(reversed);
    }
}
/*
Given a String variable sentence,
write code to get each word and assign to
String reversed in reverse order.

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
 */