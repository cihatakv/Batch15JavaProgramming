package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveItemPractice {
    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);

        System.out.println("lst2 = " + lst);
//        lst.remove(3);
//        System.out.println("lst after removing index 3 = " + lst);

        lst.remove(Integer.valueOf(2));

        System.out.println("lst = " + lst);
        ArrayList<ArrayList<Integer>> myListt = new ArrayList<>();


    }
}
