package repl.repl151_175;

import java.util.Scanner;

public class Methods7Plus_Minus_152 {
    /*
    Create a method called plus_minus that gets
    an array of ints (int[]), it outputs how many
    negative , positive and zero numbers are in the array.
for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1
     */
    public static void plus_minus(int[] array) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for (int each : array) {
            if (each > 0)
                positives++;
            else if (each == 0)
                zeros++;
            else
                negatives++;
        }

        System.out.println("positives:" + positives + ", negatives:" + negatives + ", zeros:" + zeros);


    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }
}
