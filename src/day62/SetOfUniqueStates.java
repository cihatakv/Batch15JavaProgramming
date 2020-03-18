package day62;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates {
    public static void main(String[] args) {
        Set<String> states = new HashSet<>();

        states.add("Texas");
        states.add("Nevada");
        states.add("New York");
        states.add("Florida");
        states.add("Ohio");
        states.add("Illinois");

        System.out.println("states = " + states);

        System.out.println("--------WITH FOR EACH LOOP--------");

        for (String state : states) {
            System.out.println("state = " + state);
        }

        System.out.println("--------WITH ITERATOR--------");

        Iterator<String> myIter = states.iterator();

        while (myIter.hasNext()) {
            System.out.println("myIter.next() = " + myIter.next());
        }

        System.out.println("--------WITH FOREACH METHOD--------");

        states.forEach(each -> System.out.println("each = " + each));


    }
}
