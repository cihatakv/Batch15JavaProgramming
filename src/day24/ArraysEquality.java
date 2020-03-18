package day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {

        // For checking for equality of 2 array object content
        // equal --->> Arrays.equals(firstArray,secondArray)

        int[] score1 = {2, 5, 6, 7, 3, 34, 6};
        int[] score2 = {22, 45, 6, 37, 3, 6, 9};
        int[] score3 = {2, 5, 6, 7, 3, 34, 6};
        int[] score4 = {6, 5, 6, 7, 3, 2, 34};

        System.out.println(score1 == score2);
        System.out.println(score1 == score3);

        System.out.println(Arrays.equals(score1, score3));

        System.out.println(Arrays.equals(score3, score4));

        Arrays.sort(score1);
        Arrays.sort(score4);
        System.out.println(Arrays.equals(score1, score4));


    }
}
