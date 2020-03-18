package day63;

import java.util.HashMap;
import java.util.Map;

public class MapGrocery {

    public static void main(String[] args) {

        Map<String, Double> groceryItemsPair = new HashMap<>();

        groceryItemsPair.put("Apple", 1.99);
        groceryItemsPair.put("Orange", 2.49);
        groceryItemsPair.put("Tomato", 1.49);
        groceryItemsPair.put("Potato", 0.99);
        groceryItemsPair.put("Banana", 0.59);
        groceryItemsPair.put("Onion", 0.49);
        groceryItemsPair.put("Cucumber", 1.99);
        groceryItemsPair.put("Cucumber", 2.99);

        System.out.println("groceryItemsPair = " + groceryItemsPair);

        groceryItemsPair.putIfAbsent("Cucumber", 3.99);

        System.out.println("groceryItemsPair = " + groceryItemsPair);

        System.out.println("3rd Item Value = " + groceryItemsPair.get("Onion"));

        groceryItemsPair.replace("Potato", groceryItemsPair.get("Potato") * 2);

        groceryItemsPair.replace("Banana", groceryItemsPair.get("Banana") * 2);

        System.out.println("groceryItemsPair = " + groceryItemsPair);

        groceryItemsPair.remove("Tomato");

        System.out.println("groceryItemsPair = " + groceryItemsPair);


    }

}
