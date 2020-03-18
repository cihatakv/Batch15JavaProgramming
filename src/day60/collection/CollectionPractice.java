package day60.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionPractice {
    public static void main(String[] args) {

        // List is the only data structure that have index non of the other data structure has index
        // List<String> names = new ArrayList<>();

        Collection<String> names = new ArrayList<>();

        names.add("Hasan");
        names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana");
        names.add("Daria");
        names.add("Lorin");

        names.addAll(names);


        System.out.println(names);


        names.remove("Hasan");

        for (String each : names) {
            System.out.println("eachName = " + each);
        }

//        System.out.println("First item "  + names.get(0));


//        Collection<Integer>


    }
}
