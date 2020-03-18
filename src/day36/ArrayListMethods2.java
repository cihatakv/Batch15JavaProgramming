package day36;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        // Create an ArrayList object of ong and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

        // C.R.U.D.
        // Create, Read, Update, Delete
        // add item, insert an item, read item, update item, remove item, check the location...

        lst.add(5L);
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        System.out.println("lst = " + lst);
        // add 125 between 100L and 150L
        lst.add(2, 125L);

        System.out.println("lst = " + lst);

        System.out.println("lst.get(3) = " + lst.get(3));

        lst.set(3, 195L);

        System.out.println("New values of lst.get(3) = " + lst.get(3));

        // removing item by its value

        lst.remove(100L);
        System.out.println("after removing 100 = " + lst);

        // removing item by its index

        lst.remove(2);

        System.out.println("after removing item at index 2 = " + lst);

        ArrayList<Integer> lstInt = new ArrayList<>();
        lstInt.add(1);
        lstInt.add(10);
        lstInt.add(100);
        lstInt.add(1);
        lstInt.add(1000);

        lstInt.remove(Integer.valueOf(1));

        System.out.println("lstInt = " + lstInt);

//        lstInt.clear();
//
//        System.out.println(lstInt.isEmpty());

        // check whether we have certain item or not

        System.out.println("lstInt.contains(10) = " + lstInt.contains(10));


        // check whether we have certain item or not without contains

        System.out.println("Does lstInt contain 150 = " + (lstInt.indexOf(150) != -1));


    }
}
