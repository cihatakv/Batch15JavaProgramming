package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeInsert {
    public static void main(String[] args) {

        List<Integer> lst2 = new ArrayList<>();

        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :

        if (lst2.contains(34))
            lst2.add(lst2.indexOf(34) + 1, 100);
        System.out.println("lst2 = " + lst2);

        if (lst2.contains(44)) {
            for (int i = 0; i < 5; i++) {
                lst2.add(lst2.indexOf(44), 100);
            }
            System.out.println("lst2 = " + lst2);
        }
    }
}
