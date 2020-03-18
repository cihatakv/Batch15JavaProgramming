package day63;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {

        Map<String, String> nameAndStatePair = new HashMap<>();

        nameAndStatePair.put("Cihat", "Texas");
        nameAndStatePair.put("Ali", "Texas");
        nameAndStatePair.put("Veli", "Florida");

        System.out.println("nameAndStatePair = " + nameAndStatePair);

        System.out.println("nameAndStatePair.get(\"Ali\") = " + nameAndStatePair.get("Ali"));

        Map<Integer, String> groupNumLeaderNamePair = new HashMap<>();

        Map<String, Double> groceryNameAndPricePair = new HashMap<>();

        Map<String, Boolean> voterAndEligibilityPair = new HashMap<>();

        Map<String, Integer> gameNameAndScorePair = new HashMap<>();

        Map<Byte, Character> questionNumAndCorrectAnswerPair = new HashMap<>();


    }
}
