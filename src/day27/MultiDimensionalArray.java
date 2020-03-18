package day27;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}};
        System.out.println(Arrays.deepToString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
        System.out.println("\n================================");
        System.out.println("All the even numbers");
        int[][] ages = {{10}, {12, 13, 14, 16, 17}, {19, 20, 21, 22, 23}};
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                if (ages[i][j] % 2 == 0)
                    System.out.print(ages[i][j] + " ");
            }
        }

        System.out.println("\n================================");

        int[] arr1D = {1, 2, 3};

        for (int each : arr1D) {
            System.out.print(each + " ");
        }

        System.out.println("\n================================");

        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80, 90, 100}};

        for (int[] each1dArray : arr2D) {
            for (int eachElement : each1dArray) {
                System.out.print(eachElement + " ");
            }
        }



    }
}
