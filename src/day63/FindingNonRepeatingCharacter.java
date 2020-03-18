package day63;

import java.util.*;

public class FindingNonRepeatingCharacter {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";
        String[] charArr = str.split("");

        System.out.println("Arrays.toString(charArr) = " + Arrays.toString(charArr));

        List<String> charLst = Arrays.asList(charArr);

        Set<String> charSet = new LinkedHashSet<>(charLst);

        System.out.println("charSet = " + charSet);

        Set<String> charSetShortWay = new HashSet<>(Arrays.asList(str.split("")));

        System.out.println("charSetShortWay = " + charSetShortWay);

        Map<Character, Integer> occuranceMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            int existingOccurance = occuranceMap.getOrDefault(c, 0);
            occuranceMap.put(c, existingOccurance++);

        }

        System.out.println("occuranceMap = " + occuranceMap);


    }
}
