package exercise.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueCharsInString {
    public static void main(String[] args) {
        System.out.println("uniqueChars(\"book\") = " + uniqueChars("book"));
        System.out.println("uniqueChars(\"abcdeeffgghhijkl\") = " + uniqueChars("abcdeeffgghhijkl"));

        System.out.println("uniqueCharsInAString(\"axbxpcdeeffgghhijkll\") = " + uniqueCharsInAString("axbxpcdeeffgghhijkll"));
    }

    public static List<String> uniqueChars(String str) {

        List<String> lst = new ArrayList<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            int cnt = -1;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    cnt++;
            }
            if (cnt == 0)
                lst.add(str.charAt(i) + "");
        }
        return lst;
    }

    public static List<Character> uniqueCharsInAString(String str) {
        List<Character> lst = new ArrayList<>();
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < str.length() - 1; i++) {
            if (arr[i] != arr[i + 1])
                lst.add(arr[i]);
            else
                i++;
        }
        if (arr[arr.length-2] != arr[arr.length-1])
            lst.add(arr[arr.length-1]);

        return lst;
    }

}
