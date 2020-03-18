package repl.repl151_175;

import java.util.Scanner;

public class ArraysDiagonalDifference2D_172 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result = 0;
        int leftToRightDiagonal = 0;
        int rightToLeftDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    leftToRightDiagonal += matrix[i][j];
                }
                if (i + j == 2) {
                    rightToLeftDiagonal += matrix[i][j];
                }
            }
        }
        result = leftToRightDiagonal - rightToLeftDiagonal;
        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
