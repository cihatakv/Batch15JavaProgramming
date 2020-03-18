package day16;

import java.util.Scanner;

public class GetSecondWordGetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Sentence ");
        String sentence = scan.nextLine();
        int firstIndexOfSPace = sentence.indexOf(" ");
        //int secondIndexOfSpace = sentence.lastIndexOf(" ");
        int secondIndexOfSpace = sentence.indexOf(" ", firstIndexOfSPace + 1 );
        String secondWord = "";
        for (int i = firstIndexOfSPace; i < secondIndexOfSpace; i++) {
            if (sentence.charAt(i) != " ".charAt(0))
            secondWord += sentence.charAt(i);
        }
        System.out.println(secondWord);

//        String word = "";
//        int length = sentence.length();
//        int indexOfSpace = sentence.indexOf(' ');
//        for (int i = indexOfSpace; i < length; i++){
//
//            //if (sentence.charAt(i) != " ".charAt(0)){
//                word += "" + sentence.charAt(i+1);
//            //}
//        }
//        System.out.println(word);

        //String word2 = sentence.indexOf()
    }
}
