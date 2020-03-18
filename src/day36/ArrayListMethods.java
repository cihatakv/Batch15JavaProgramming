package day36;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        // Create an ArrayList object of ong and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

        // C.R.U.D.
        // Create, Read, Update, Delete
        // add item, insert an item, read item, update item, remove item, check the location...

        lst.add(5L);
        lst.add(100L);
        lst.add(200L);
        System.out.println("lst = " + lst);

        // Counting items inside ArrayList
        System.out.println(lst.size());

        System.out.println("First item is : lst.get(0) = " + lst.get(0));

        //Task: Get the sum of above ArrayList

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i);
        }
        System.out.println("sum = " + sum);

        System.out.println("lst = " + lst);

        lst.add(lst.get(0));
        lst.remove(0);

        System.out.println("lst = " + lst);


        long max = lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max)
                max = lst.get(i);
        }

        System.out.println("max = " + max);


    }
}
