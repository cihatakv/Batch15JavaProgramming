package day64;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Map_ValuesView {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Collection<Double> allPrices = groceryPriceMap.values();

        System.out.println("allPrices = " + allPrices);

        allPrices.remove(1.99);

        System.out.println("groceryPriceMap = " + groceryPriceMap);

    }
}
