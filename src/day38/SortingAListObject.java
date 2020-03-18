package day38;

import java.util.*;

public class SortingAListObject {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        System.out.println("Before sorting nums = " + nums);

        // Two ways to sort an ArrayList
        // Use Collections utility class(just like Arrays utility class for array object)

        // Collections is a class coming from java.util package
        // it has a lot of ready method to work with Collection object
        Collections.sort(nums);

        System.out.println("After sorting nums = " + nums);

        // This version of sort method accept 2 arguments
        // 1st is the list to be sorted
        // 2nd a Comparator Object that contains comparing logic
        // good news is there is ready method already in java
        // we can get reverse order comparator object by calling
        // Comparator.reverseOrder()
        Collections.sort(nums, Comparator.reverseOrder());


        List<Integer> nums2 = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        System.out.println("nums2 = " + nums2);
        for (int i = 0; i < nums2.size() / 2; i++) {
            Integer temp = nums2.get(i);
            nums2.set(i, nums2.get(nums2.size() - 1 - i));
            nums2.set(nums2.size() - 1 - i, temp);
        }

        System.out.println("nums2 = " + nums2);


//

    }
}
