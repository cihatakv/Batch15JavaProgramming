package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {

        String str = "Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously " +
                "Do it and find out Words Words Words";



        String[] arr = str.split(" ");

        Map<String, Integer> m = new HashMap<>();

        for (String each : arr) {
            if (!m.containsKey(each)) {
                m.put(each, 1);
            } else {
                m.replace(each, m.get(each) + 1);
            }
        }

        System.out.println("m = " + m);


    }
}
