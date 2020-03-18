package day27;

import java.util.Arrays;

public class MultiDimensionalArray_3D {
    public static void main(String[] args) {

        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}};

        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        //                            0                       1
        // Print 9:
        System.out.println(arr3D[1][0][2]);
        // Print 2:
        System.out.println(arr3D[0][0][1]);
        // Print 1,2,3
        System.out.println(arr3D[0][0]);
        // Print 10,11,12
        System.out.println(arr3D[1][1]);


        // Print All:
        System.out.println(Arrays.deepToString(arr3D));

        System.out.println("===========================");





    }
}
