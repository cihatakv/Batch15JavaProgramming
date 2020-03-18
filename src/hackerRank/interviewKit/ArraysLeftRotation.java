package hackerRank.interviewKit;

public class ArraysLeftRotation {

    public static void main(String[] args) {
        int n = 5;
        int d;
        int[] a = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[4] = temp;
        }

    }
}
