package repl.AutoGradedCourse;

public class ManipulatingElementsInA2DArray {
    public static void main(String[] args) {
        int[][] a = {
                {14, 20, 3, 2},
                {4, 15, 6, 1},
                {12, 31, 4, 16}};
        System.out.println(mystery(a, 3, 4)); //should print 5

        //System.out.println("Arrays.toString(a) = " + Arrays.deepToString(a));
        for (int[] row : a) {     //prints array
            for (int e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    public static int mystery(int[][] nums, int rows, int cols) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                nums[i][j] /= 3;
                if (nums[i][j] % 2 == 1)
                    sum += nums[i][j];
            }
        }
        return sum;
    }
}
