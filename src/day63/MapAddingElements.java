package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {

        Map<String, Integer> nameAgePair = new HashMap<>();

        nameAgePair.put("Zehra", 6);
        nameAgePair.put("Muhammed", 21);
        nameAgePair.put("Maiia", 27);
        nameAgePair.put("Aidar", 20);
        nameAgePair.put("Fatih", 27);
        nameAgePair.put("Rohksana", 16);
        nameAgePair.put("Zehra", 7);

        nameAgePair.putIfAbsent("Zehra", 10);


        System.out.println("nameAgePair = " + nameAgePair);

        System.out.println("nameAgePair.size() = " + nameAgePair.size());

        System.out.println("Zehra's age = " + nameAgePair.get("Zehra"));

        System.out.println("nameAgePair.containsKey(\"Ruhksona\") = " + nameAgePair.containsKey("Ruhksona"));

        System.out.println("nameAgePair.containsKey(\"Hasan\") = " + nameAgePair.containsKey("Hasan"));

        nameAgePair.replace("Maiia", 17);
        System.out.println("nameAgePair.get(\"Maiia\") = " + nameAgePair.get("Maiia"));
        System.out.println("nameAgePair after updating Maiia's age= " + nameAgePair);

        nameAgePair.replace("Zehra", 7, 9);
        System.out.println("nameAgePair = " + nameAgePair);


    }
}
