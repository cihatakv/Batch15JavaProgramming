package hackerRank.interviewKit;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        long n = in.nextLong();

//        long occurance = n / s.length();
//        long remainingCharacter = n % s.length();
//        String newS = "";
//        for (int i = 0; i < occurance; i++) {
//            newS += s;
//        }
//
//
//
//        newS += s.substring(0, (int)remainingCharacter);
//
//        System.out.println("newS = " + newS);
//
//        char firstLetter = s.charAt(0);
//
//        long counter = 0L;
//        for (long i = 0L; i < newS.length(); i++) {
//            if (newS.charAt((int)i) == firstLetter)
//                counter++;
//        }
//
//        System.out.println("counter = " + counter);

        long countOfFirstCharacter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                countOfFirstCharacter++;
        }

        countOfFirstCharacter = (n / s.length()) * countOfFirstCharacter;
        long remainingCharacter = n % s.length();

        String remainStr = s.substring(0, (int) remainingCharacter);
        for (int i = 0; i < remainStr.length(); i++) {
            if (remainStr.charAt(i) == s.charAt(0))
                countOfFirstCharacter++;
        }
        System.out.println("countOfFirstCharacter = " + countOfFirstCharacter);


    }
}
