package day24;

import java.util.Arrays;

public class ArraysMethodString {
    public static void main(String[] args) {
        int[] scores = {99, 44, 66, 23, 19, 55};
        System.out.println(Arrays.toString(scores));

        // For sorting an array in ascending order
        // sort --->> Arrays.sort(yorArrayHere)

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));
        System.out.println("------Character sorting------");
        char[] nameChars = {'G', ' ', 'd', 'Z', '9', 'A'};
        System.out.println("Before sorting = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("After sorting = " + Arrays.toString(nameChars));

        System.out.println("------String sorting------");
        String[] superHero = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        // Only first character matters in string sorting
        System.out.println("Before soring superheros " + Arrays.toString(superHero));
        Arrays.sort(superHero);
        System.out.println("After soring superheros " + Arrays.toString(superHero));

        System.out.println("------Boolaen sorting------");
        boolean[] fiveSwitchonOffs = {true, false, true, true, false};
        System.out.println("fiveSwitchonOffs = " + Arrays.toString(fiveSwitchonOffs));



    }
}
