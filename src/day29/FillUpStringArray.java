package day29;

import java.util.Arrays;

public class FillUpStringArray {
    public static void main(String[] args) {
        // Create an array with size 300 and fill up with I Love Java

        String[] strArr = new String[300];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "I Love Java";
        }

        System.out.println("strArr = " + Arrays.toString(strArr));

    }
}
