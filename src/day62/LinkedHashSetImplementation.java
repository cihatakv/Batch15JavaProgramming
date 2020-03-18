package day62;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {

        // If you want to keep insertion order (First come first server)
        // and it also remove duplicates
        // it is sub class of HashSet

        Set<Integer> nums = new LinkedHashSet<>();

        nums.add(10);
        nums.add(10);
        nums.add(22);
        nums.add(13);
        nums.add(13);
        nums.add(30);
        nums.add(30);

        System.out.println("nums = " + nums);

        Set<Integer> nums2 = new HashSet<>();

        nums2.add(10);
        nums2.add(10);
        nums2.add(22);
        nums2.add(13);
        nums2.add(13);
        nums2.add(30);
        nums2.add(30);

        System.out.println("nums2 = " + nums2);
    }
}
