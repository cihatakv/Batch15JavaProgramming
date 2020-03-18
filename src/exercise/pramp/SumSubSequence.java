package exercise.pramp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class SumSubSequence {

    public static void main(String[] args) {
        int[] arr = {3, 5, -1, 8, 12};
        int[] arr2 = {5, 7, 16, 1, 2};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));

        System.out.println(isSubsequence(arr.length - 1, arr));

        System.out.println(Arrays.toString(arr2));

        System.out.println(isSubsequence(arr2.length - 1, arr2));
    }

    public static String isSubsequence(int limit, int[] array) {
        // For 4 elements array subsequences = (2**4-1)=15  so formula (2**limit-1)
        int sizeOfSubSequences = (int) Math.pow(2, limit);

        for (int count = 1; count < sizeOfSubSequences; count++) {
            ArrayList<Integer> subList = new ArrayList<Integer>(); // subsequences dynamic
            for (int i = 0; i < limit; i++) {
                if (BigInteger.valueOf(count).testBit(i)) {// if i index set in count , get value from arr[]
                    subList.add(array[i]); // add value into list
                }
            }
            int total = 0;
            for (int x = 0; x < subList.size(); x++) { // find the total of first group
                total += subList.get(x);
            }
            if (total == array[array.length - 1]) { // is group equal to highest value?
                return "true"; // return string true and stop to run method
            }//else go to top loop increase count
            // re create same list and record new sets into it
        }
        return "false";
    }

}