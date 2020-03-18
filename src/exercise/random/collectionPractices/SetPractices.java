package exercise.random.collectionPractices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractices {
    public static void main(String[] args) {
        // Set doesn't accept duplicates
        // HashSet class creates a collection that use a hast table for storage
        // HashSet only contain unique elements and it inherits the abstractSet class and implements Set Interface

        // boolean add(); void clear();
        // int Size();
        // Iterator iterator();
        // Object clone();
        // boolean remove(object o);
        // boolean isEmpty();
        // Boolean contains(Object o);


        HashSet<Integer> integerSet = new HashSet<>();

        integerSet.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println("integerSet = " + integerSet);

        HashSet cloned_set = new HashSet();

        cloned_set = (HashSet) integerSet.clone();
        


        if (integerSet.contains(40)) {
            System.out.println("integerSet contains 40");
        } else {
            System.out.println("integerSet does not contain 40");
        }




        for (Integer i : integerSet) {
            System.out.println("i = " + i);
        }

        Iterator iterator = integerSet.iterator();

        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }




//        System.out.println("iterator.next() = " + iterator.next());
//
//        System.out.println("iterator.next() = " + iterator.next());

        // System.out.println("integerSet = " + integerSet);






    }
}
