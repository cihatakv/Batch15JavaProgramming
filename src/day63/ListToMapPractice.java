package day63;

import java.util.*;

public class ListToMapPractice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Abraham Hope", "Zeliha Sezer", "Onuralp Dursun",
                "Tugba Bekar", "Birnigar Ozyurt", "Seda Civan", "Nuran Demir", "Murat Kilinc", "Hakan Durmus"
                , "Mariia Lukianenko"
        ));

        Map<String, Integer> nameCharCountPair = new HashMap<>();

        for (String name : names) {
            nameCharCountPair.put(name, name.length());
        }

        System.out.println("nameCharCountPair = " + nameCharCountPair);

    }
}
