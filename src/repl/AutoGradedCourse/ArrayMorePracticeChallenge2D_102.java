package repl.AutoGradedCourse;

public class ArrayMorePracticeChallenge2D_102 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        System.out.println(isMagic(a)); //true
        int[][] b = {
                {1, 1, 2},
                {3, 2, 3},
                {1, 4, 1}
        };
        System.out.println(isMagic(b)); //false
        int[][] c = {
                {1, 1, 1},
                {2, 2, 2}
        };
        System.out.println(isMagic(c)); //false
        int[][] d = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
        System.out.println(isMagic(d)); //true
    }

    public static boolean isMagic(int[][] array) {

        boolean status = true;
        int rowInArr = 0;
        for (int[] ints : array) {
            rowInArr++;
        }

        int[] sum = new int[rowInArr + 2];

        int i = 0;
        for (int[] cols : array) {
            for (int rows : cols) {
                sum[i] += rows;
            }
            i++;
        }

        for (int j = 0; j < rowInArr; j++) {
            sum[i] += array[j][0];
        }

        for (int k = 0; k < rowInArr; k++) {
            sum[i + 1] += array[k][k];
        }


        for (int m = 0; m < sum.length - 1; m++) {
            if (sum[m] != sum[m + 1])
                status = false;
        }
        return status;
    }
}

/*A 2D array is considered "magic" if the following are true:
The array is square (N rows and N columns)
The sums of each row, the sums of each column, and the sums of each diagonal are all equal.

Complete the isMagic method so that it will determine whether a given array is magic.

 */