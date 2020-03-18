package day25;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String name = "Cihat";
        char[] allCharsInName = name.toCharArray();
        int countA = 0;

        for (char eachChar : allCharsInName) {
            if (eachChar == 'a')
                countA++;
        }

        System.out.println("There is/are " + countA + " a character(s).");

        Arrays.sort(allCharsInName);
        System.out.println("allCharsInName = " + Arrays.toString(allCharsInName));



    }
}
