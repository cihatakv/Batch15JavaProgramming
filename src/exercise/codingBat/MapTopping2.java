package exercise.codingBat;

import java.util.HashMap;
import java.util.Map;

public class MapTopping2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
        //topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
        //topping2({"yogurt": "salt"}) → {"yogurt": "salt"}

        map.put("ice cream", "cherry");



        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        System.out.println("map = " + map);
    }
}
