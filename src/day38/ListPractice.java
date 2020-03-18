package day38;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1, 4, 5, 7, 8, 5, 3, 2, 19};
        List<Integer> numsLst = Arrays.asList(nums);
        Integer[] numsArr = numsLst.toArray(new Integer[9]);
        System.out.println(Arrays.toString(numsArr));

    }
}
