package exercise.volkanIstek;

import java.util.Arrays;

public class VolkanIstekChapter6 {
    public static void main(String[] args) {
        // long num = 4388576018402626L;
        long num = 1234;
        String[] arr = String.valueOf(num).split("");
        int tens;
        int ones;
        for (int i = 0; i < arr.length; i += 2) {
            int x = Integer.parseInt(arr[i]) * 2;
            if (x > 9) {
                tens = x / 10;
                ones = x % 10;
                x = tens + ones;
            }
            arr[i] = String.valueOf(x);
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        long newNum = 0;
        int size = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            long temp = Long.parseLong(arr[i]);
            newNum += temp * Math.pow(10, size);
            size--;
        }
        System.out.println("newNum = " + newNum);

    }
}
