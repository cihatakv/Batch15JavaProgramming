package exercise.pramp;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAddition1 {
    public static boolean arrayAddition1(int[] arr) {
        boolean status = false;

        Arrays.sort(arr);


        return status;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(arrayAddition1(new int[]{1, 2, 3, 4, 5, 15}));

    }
}
