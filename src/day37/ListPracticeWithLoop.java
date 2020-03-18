package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {
        /**
         * Create an ArrayList of Integer and fill it up with 1-100
         */
        List<Integer> nums = new ArrayList<>();
        for (int number = 1; number <= 100; number++) {
            nums.add(number);
        }
        System.out.println("nums = " + nums);

        // change the all the odd number value to zero

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1)
                nums.set(i, 0);
        }
        System.out.println("nums = " + nums);

        // find index of value 20

        System.out.println("Index of 20 = " + nums.indexOf(20));

        // insert 100 to first index

        nums.add(0, 100);
        System.out.println("nums = " + nums);

        System.out.println("Index of 20 After inserting 100 at index 0 = " + nums.indexOf(20));

    }
}
