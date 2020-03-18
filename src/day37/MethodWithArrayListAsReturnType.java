package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {
        System.out.println(getListFrom1ToFinalNumber(5));

        System.out.println(getListFrom1ToFinalNumber(15));

        System.out.println(getListFrom1ToFinalNumber(10));

        System.out.println(getListFrom1ToFinalNumber(7));

        List<Integer> myList = getListFrom1ToFinalNumber(8);
        System.out.println("myList = " + myList);

    }

    /**
     * This method will return a list of Integer that containing numbers
     * Starting from 1 ill finalNumber
     *
     * @param finalNum This is the last item of the list
     * @return List<Integer> that contains 1 till final numbers increased by 1
     */

    public static List<Integer> getListFrom1ToFinalNumber(int finalNum) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= finalNum; i++) {
            nums.add(i);
        }
        return nums;
    }
}
