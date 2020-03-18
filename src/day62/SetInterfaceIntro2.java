package day62;

import java.util.*;

public class SetInterfaceIntro2 {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(10, 10, 20, 20, 20, 30, 30, 30, 30);
        Set<Integer> myNums = new HashSet<>(numList);

        System.out.println("numList = " + numList);
        System.out.println("myNums = " + myNums);

        myNums.add(25);
        System.out.println("myNums after adding 25 = " + myNums);
        List<Integer> numList2 = new ArrayList<>();

        numList2.addAll(myNums);
        System.out.println("numList2 = " + numList2);


    }
}
