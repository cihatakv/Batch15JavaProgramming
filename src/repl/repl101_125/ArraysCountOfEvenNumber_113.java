package repl.repl101_125;


import java.util.Scanner;

public class ArraysCountOfEvenNumber_113 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        int countEven = 0;

        // input data to the each elements in the array with Loop
        for (int i = 0; i < nums.length; i++) {
            // read each elements one by one to
            nums[i] = scan.nextInt();
            // check if it is even (num %2 == 0)
            if (nums[i] % 2 == 0) {
                // increment the count of even numbers.
                countEven++;
            }
        }
        // print the count
        System.out.println(countEven);
    }
}
