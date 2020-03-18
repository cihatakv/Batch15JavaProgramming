package repl.repl101_125;

import java.util.Scanner;

public class ArraysPrinting03_118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below

        for (int i = 0; i < arr.length; i += 3) {
            System.out.println(arr[i] + " , " + arr[i + 1] + " , " + arr[i + 2]);

        }

    }
}
