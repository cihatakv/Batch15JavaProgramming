package day27;

public class MultiDimensionalArray_3D_Practice {
    public static void main(String[] args) {

        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}};

        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    System.out.print(arr3D[i][j][k] + " ");
                }

            }
        }
        System.out.println();
        for (int[][] each2DArray : arr3D) {
            for (int[] each1DArray : each2DArray) {
                for (int eachElement : each1DArray) {
                    System.out.print(eachElement + " ");
                }
            }
        }
    }
}
