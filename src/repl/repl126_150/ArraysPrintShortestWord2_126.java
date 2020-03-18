package repl.repl126_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintShortestWord2_126 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] strArr = str.split(", ");

        int min = strArr[0].length();
        String shortWords = "";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() < min) {
                // shortWords += strArr[i] + " ";
                min = strArr[i].length();
            }
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() == min) {
                shortWords += strArr[i] + " ";
            }
        }
        shortWords = shortWords.substring(0, shortWords.lastIndexOf(" "));
        String[] strArr2 = shortWords.split(" ");
        Arrays.sort(strArr2);
        System.out.println(Arrays.toString(strArr2));
    }
}
/*
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.
Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
 */