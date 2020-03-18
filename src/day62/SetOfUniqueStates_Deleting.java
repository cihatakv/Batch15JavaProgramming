package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates_Deleting {
    public static void main(String[] args) {


        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before = " + states);
//        states.remove("GA");
//        System.out.println("states after  = " + states);

        // Remove all the states with letter A

        Iterator<String> iterStates = states.iterator();

        while (iterStates.hasNext()) {
            String s = iterStates.next();
            if (s.contains("A")) {
                System.out.println("iterStates.next() will be deleted = " + s);
                iterStates.remove();
            }
        }

        // states.removeIf(s -> s.contains("A"));
        System.out.println("states = " + states);

        states.removeIf(each -> each.contains("L"));

        System.out.println("states = " + states);

    }
}
