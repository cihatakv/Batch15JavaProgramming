package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAllMethodPractice {
    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(2000);
        nums2.add(1000);

        // add all nums2 items to nums1

        nums1.addAll(nums2);

        System.out.println("nums1 = " + nums1);
        System.out.println("nums2 = " + nums2);

        // Arrays.aslist method will return a List object that contains items it specified.
        // add 4 items to nums2 using addall 100,200,300,400
        nums2.addAll(Arrays.asList(100, 200, 300, 400));

        System.out.println("nums2 = " + nums2);
    }
}
