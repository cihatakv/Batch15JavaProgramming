package day63;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacterMaps {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        Map<String, Integer> freq = new HashMap<>();

        for (String each : str.split("")) {
            if (!freq.containsKey(each)) {
                freq.put(each, 1);
            } else
                freq.put(each, freq.get(each) + 1);
        }

        System.out.println("freq = " + freq);


    }
}
