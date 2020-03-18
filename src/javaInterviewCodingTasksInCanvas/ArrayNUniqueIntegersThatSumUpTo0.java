package javaInterviewCodingTasksInCanvas;

// Array -- N unique integers that sum up to 0
// Write a function:
// that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
// The function can return any such array. For example, given N = 4,
// the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect
// (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]
// (but there are many more correct answers).

import java.util.Random;

public class ArrayNUniqueIntegersThatSumUpTo0 {
    public static void main(String[] args) {


    }

    public static int[] uniqueInteger(int n) {
        int[] a = new int[n];
        Random r = new Random();
        // Set<Integer>

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            a[i] = r.nextInt(25);
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j])
                    break;
            }

        }


        return a;
    }
}
