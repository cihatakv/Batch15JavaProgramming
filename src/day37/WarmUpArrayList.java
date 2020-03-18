package day37;

import java.util.ArrayList;
import java.util.List;

public class WarmUpArrayList {
    public static void main(String[] args) {
        List<String> teamMates = new ArrayList<>();

        teamMates.add("John");
        teamMates.add("Michael");
        teamMates.add("Jo");
        teamMates.add("Sanchez");

        // print one by one
        System.out.println("Print one by one");
        for (int i = 0; i < teamMates.size(); i++) {
            System.out.println(teamMates.get(i));
        }
        // print reverse
        System.out.println("\nPrint reverse");
        for (int i = teamMates.size() - 1; i >= 0; i--) {
            System.out.println(teamMates.get(i));
        }

        // print first last
        System.out.println("\nPrint first last");
        System.out.println(teamMates.get(0));
        System.out.println(teamMates.get(teamMates.size() - 1));

        // print 2 at a time
        System.out.println("\nPrint 2 at a time");
        for (int i = 0; i < teamMates.size() - 1; i += 2) {
            System.out.println(teamMates.get(i) + " " + teamMates.get(i + 1));
        }

        // Concat everyone in one string separated by -
        System.out.println("\nConcat everyone in one string separated by -");
        for (int i = 0; i < teamMates.size() - 1; i++) {
            System.out.print(teamMates.get(i) + "-");
        }
        System.out.print(teamMates.get(teamMates.size() - 1));

        // Challenge: Pair them up By 3
        System.out.println("\nPair them up By 3");
        for (int i = 0; i < teamMates.size() - 2; i++) {
            System.out.println(teamMates.get(i) + " " + teamMates.get(i + 1) + " " + teamMates.get(i + 2));
        }

        // TODO: How can we turn a list to

        String lstString = teamMates.toString();
        System.out.println(lstString.replace(", ", "-"));
        System.out.println(lstString.substring(1, lstString.length() - 1));


    }
}
/*
Warm up:
Create Arraylist of String and store
teamMates
print one by one
print reverse
print first last
print 2 at a time
concat everyone in one string separated by -
 */