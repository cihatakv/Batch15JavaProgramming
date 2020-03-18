package repl.repl101_125;

import javax.swing.*;
import java.util.Scanner;

public class PrintVowels_106 {
    public static void main(String[] args) {
        // A, E, I, O, U;
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        // int count = 0;
        String vowelList = "";
//        for (int i = 0; i <= word.length()-1 ; i++) {
//            if (word.substring(i, i + 1).equalsIgnoreCase("a"))
//                vowelList += word.substring(i, i + 1);
//            else if (word.substring(i, i + 1).equalsIgnoreCase("e"))
//                vowelList += word.substring(i, i + 1);
//            else if (word.substring(i, i + 1).equalsIgnoreCase("i"))
//                vowelList += word.substring(i, i + 1);
//            else if (word.substring(i, i + 1).equalsIgnoreCase("o"))
//                vowelList += word.substring(i, i + 1);
//            else if (word.substring(i, i + 1).equalsIgnoreCase("u"))
//                vowelList += word.substring(i, i + 1);
//        }
//        System.out.println(vowelList);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                vowelList += word.charAt(i);
        }
        System.out.println(vowelList);
    }
}
