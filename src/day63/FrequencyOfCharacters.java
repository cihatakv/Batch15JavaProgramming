package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBBBBBACCRDDD";

        Map<String, Integer> freq = new HashMap<>();

        String[] arr = str.split("");


        for (String each : arr) {
            if (!freq.containsKey(each)) {
                freq.put(each, 1);
            } else
                freq.put(each, freq.get(each) + 1);
        }

        System.out.println("freq = " + freq);


    }
}
