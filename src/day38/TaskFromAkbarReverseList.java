package day38;

import java.util.ArrayList;
import java.util.List;

public class TaskFromAkbarReverseList {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        reverseIt(lst);
    }

    public static void reverseIt(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        System.out.println("list = " + list);
    }
}
/*
Write a static void method to accept a List<Integer> and reverse it
(Do not create new List, use swamp logic)
 */