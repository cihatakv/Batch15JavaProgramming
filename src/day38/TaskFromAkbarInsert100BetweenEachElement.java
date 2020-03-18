package day38;

import java.util.ArrayList;
import java.util.List;

public class TaskFromAkbarInsert100BetweenEachElement {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(3);
        lst.add(7);
        lst.add(2);
        lst.add(12);
        lst.add(7);
        add100BetweenEachElement(lst);
    }

    public static void add100BetweenEachElement(List<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            list.add(i, 100);
        }
        System.out.println("lst = " + list);
    }
}
/*
Given a ArrayList of 6 Integer 1,3,7,2,12,7
insert 100 in between each numbers
For example :
1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7

Optionally make it a method
write a static void method that accept a
ArrayList of integer object and insert 100 in between items.
*/