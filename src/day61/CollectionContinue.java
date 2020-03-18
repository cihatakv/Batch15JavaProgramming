package day61;

import java.util.*;

public class CollectionContinue {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 6, 4, 5, 7, 8));
        nums.add(72);
        System.out.println("nums = " + nums);

        Collections.sort((List<Integer>) nums);
        System.out.println("nums = " + nums);


    }
}
