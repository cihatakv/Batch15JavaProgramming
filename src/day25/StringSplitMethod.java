package day25;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] allWords = sentence.split(" ");

        System.out.println("allWords = " + Arrays.toString(allWords));

        System.out.println("word count is " + allWords.length);

        System.out.println("Last word in the sentence is " + allWords[allWords.length - 1]);

        String sentence2 = "Everything is awesome!!!";
        // split by letter e

        String[] splitByEArray = sentence2.split("e");

        System.out.println("splitByEArray = " + Arrays.toString(splitByEArray));

        for (String eachPieces : splitByEArray) {
            System.out.println("eachPieces = " + eachPieces);
        }

        // split this sentence by is and print out the result

        String[] splitByIsArr = sentence2.split("is");

        System.out.println("splitByIsArr = " + Arrays.toString(splitByIsArr));
        System.out.println("firs character's of second index " + splitByIsArr[1].charAt(0));

        System.out.println("===========================");

        //  String sentence2 = "Everything is awesome!!!";

        String[] arr2 = sentence2.split(" ");

        int max = 0;
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].length() > max) {
                max = arr2[i].length();
                j = i;
            }
        }

        System.out.println("Longest word which is " + arr2[j] + " has " + max + " characters" );







    }
}
