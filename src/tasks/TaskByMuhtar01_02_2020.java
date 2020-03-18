package tasks;

public class TaskByMuhtar01_02_2020 {
    public static void removeDup2(String str) {
        String strSentence = "";
        for (int i = 0; i < str.length(); i++) {
            if (!strSentence.contains(str.charAt(i) + ""))
                strSentence += str.charAt(i);
        }
        System.out.println("strSentence = " + strSentence);
    }

    // write a return method called RemoveDup that accepts a String and removes duplicate values from the String
    public static void removeDup(String str) {
        String strSentence = "";
        int i = 0;
        for (i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1))
                strSentence += str.charAt(i);
        }
        strSentence += str.charAt(i);
        System.out.println("strSentence = " + strSentence);
    }
    // write a return method called Frequency that accepts String and  char,
    // the method will return the total number of occurrence of the given char in the given string

    public static int frequency(String str, char c) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                cnt++;
        }
        return cnt;
    }

    public static String frequencyOfChars2(String str) {
        String strSentence = "";
        for (int i = 0; i < str.length(); i++) {
            if (!strSentence.contains(str.charAt(i) + ""))
                strSentence += str.charAt(i);
        }
        System.out.println("frequencyOfChars2 --> strSentence = " + strSentence);
        String charAndStr = "";
        for (int i = 0; i < strSentence.length(); i++) {
            charAndStr += strSentence.charAt(i);
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (strSentence.charAt(i) == str.charAt(j))
                    cnt++;
            }
            charAndStr += cnt;
        }
        return charAndStr;
    }

    // Task03: frequencyOfChars( "AAABBBCCC" )  ==> A3B3C3
    // ABC
    // A3B3C3
    public static String frequencyOfChars(String str) {

        String strSentence = "";
        int i = 0;
        for (i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1))
                strSentence += str.charAt(i);
        }
        strSentence += str.charAt(i);

        String[] c = strSentence.split("");

        String result = "";
        String temp = "";

        for (String each : c) {
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (each.contains(str.charAt(j) + ""))
                    cnt++;
            }
            result += each + cnt;
        }
        return result;
    }

    public static void main(String[] args) {
        String sentence = "aaahaaaaaaabbbbbbgggggggl";
        removeDup(sentence);
        removeDup2(sentence);
        System.out.println(frequency("AABABBAAB", 'A'));
        System.out.println("Task 3");
        System.out.println(frequencyOfChars("CCAAABBBCCCC"));
        System.out.println("================");
        System.out.println(frequencyOfChars2("CCAAABBBCCCC"));
    }
}
/*
1.  write a return method called RemoveDup that accepts a String
and removes duplicate values from the String
Ex:
	RemoveDuplicate("aaabbbccc") ==> "abc"
2. write a return method called Frequency that accepts String and  char,
the method will return the total number of ocuurence of the given char in the given string
Ex:
	Frequency("AAABBB", 'A') ==> 3
3. Combined the methods 1 & 2 to write a method that prints the the frequency
of each characters from the given String
Ex:
	FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"
 */