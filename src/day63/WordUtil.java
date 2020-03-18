package day63;

import java.util.HashMap;
import java.util.Map;

public class WordUtil {
    public static void main(String[] args) {

        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No Is is never Ending";

        System.out.println(getFrequencyMap(str));


    }

    public static Map<String, Integer> getFrequencyMap(String str) {
        Map<String, Integer> m = new HashMap<>();
//        SortedMap<String, Integer> sm = new TreeMap<String, Integer>();
        String[] arr = str.split(" ");
        for (String each : arr) {
            if (!m.containsKey(each)) {
//                sm.put(each, 1);
                m.put(each, 1);
            } else {
//                sm.replace(each, m.get(each) + 1);
                m.replace(each, m.get(each) + 1);
            }
        }
        return m;
    }
}
