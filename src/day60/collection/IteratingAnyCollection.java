package day60.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 22, 88, 13));

        Iterator<Integer> myIter = nums.iterator();

        while (myIter.hasNext()) {

            System.out.println("myIter.next() = " + myIter.next());

            //myIter.next();
        }

        System.out.println("------------------------------------");
        System.out.println("myIter.hasNext() = " + myIter.hasNext());

        System.out.println("------------------------------------");

        while (myIter.hasNext()) {

            if (myIter.next() <= 10)
                myIter.remove();

        }

        System.out.println("nums = " + nums);
    }


}
