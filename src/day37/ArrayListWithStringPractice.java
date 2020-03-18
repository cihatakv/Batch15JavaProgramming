package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {
        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg");
        superHeros.add("Flash");
        superHeros.add("Wonder Woman");
        superHeros.add("Aquaman");


        System.out.println("superHeros = " + superHeros);

        for (int i = 0; i < superHeros.size(); i++) {
            String currentHero = superHeros.get(i);
            if (!currentHero.contains("man")) {
                superHeros.remove(currentHero);
                i--;
            }
        }
        System.out.println("superHeros = " + superHeros);

        for (int i = superHeros.size() - 1; i >= 0; i--) {
            String currentHero = superHeros.get(i);
            if (!currentHero.contains("man")) {
                superHeros.remove(currentHero);
                //i--;
            }
        }
        System.out.println("superHeros = " + superHeros);
    }
}
