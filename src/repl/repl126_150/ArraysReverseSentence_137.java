package repl.repl126_150;

import java.util.Scanner;

public class ArraysReverseSentence_137 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below

        String[] sentenceArr = sentence.split(" ");
        for (int i = sentenceArr.length - 1; i >= 0; i--) {
            System.out.println(sentenceArr[i]);
        }
    }
}
/*
Given a String variable sentence,
write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */