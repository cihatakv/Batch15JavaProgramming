package mentoring;

import java.util.Arrays;

public class ArrayRotator {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7};
        int last = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i + 1];
            array[i + 1] = array[i];
            //array[0] = array[array.length-1];
            array[i] = temp;
        }
        //array[0] = last;
        System.out.println(Arrays.toString(array));
    }
}
