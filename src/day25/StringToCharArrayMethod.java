package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {
        String name = "Cihat";

        char[] nameChars = new char[name.length()];

//        nameChars[0] = name.charAt(0);
//        nameChars[1] = name.charAt(1);
//        nameChars[2] = name.charAt(2);

        for (int i = 0; i < name.length(); i++) {
            nameChars[i] = name.charAt(i);
        }

        System.out.println("My name in char = " + Arrays.toString(nameChars));

        char[] nameChars2 = name.toCharArray();

        System.out.println("nameChars2 = " + Arrays.toString(nameChars2));
        int countA = 0;

        for (char eachChar : nameChars) {
            if (eachChar == 'a')
                countA++;
        }

        System.out.println("There is/are " + countA + " a character(s).");



    }
}
