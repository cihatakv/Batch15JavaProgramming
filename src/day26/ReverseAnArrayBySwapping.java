package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {
    public static void main(String[] args) {
//        int[] myNumbers = new int[]{5, 3, 21, 2};
//        int size = myNumbers.length;
//        int lastIndex = size - 1;
//        int middleIndex = lastIndex / 2;
//
//        System.out.println(Arrays.toString(myNumbers));
//
//        System.out.println(myNumbers[0] + " --- " + myNumbers[lastIndex - 0]);
//
//        System.out.println(myNumbers[1] + " --- " + myNumbers[lastIndex - 1]);
//
//        System.out.println(myNumbers[2] + " --- " + myNumbers[lastIndex - 2]);
//
//        // loop this
//        System.out.println("--- Loop Here ---");
//
//        for (int i = 0; i < middleIndex; i++) {
//            System.out.println(myNumbers[i] + " --- " + myNumbers[lastIndex - i]);
//            int temp = myNumbers[i];
//            myNumbers[i] = myNumbers[lastIndex - i];
//            myNumbers[lastIndex - i] = temp;
//        }
//        System.out.println("After swap complete " + Arrays.toString(myNumbers));


        int[] myNumbers = {5 , 3 , 21 , 2 , 1 , 13, 12 };
        System.out.println(Arrays.toString(myNumbers));

        for (int i = myNumbers.length-1 ; i >= 0 ; i--) {
            System.out.print(myNumbers[i] + " ");
        }
        int middleIndex = myNumbers.length /2;

        for (int x = 0; x <middleIndex ; x++) {
            int temp = myNumbers[x];
            myNumbers[x] = myNumbers[myNumbers.length-1 -x];
            myNumbers[myNumbers.length-1 -x] = temp;
        }
        System.out.println("\nAfter swap complete "+ Arrays.toString(myNumbers));
    }
}
