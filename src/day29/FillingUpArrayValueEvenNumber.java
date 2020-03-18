package day29;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumber {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        System.out.println("Before filling up \n" + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        System.out.println("After filling up \n" + Arrays.toString(numbers));

        for (int number : numbers) {
            if (number %10 == 2)
                System.out.println();
            System.out.print(number + " ");
        }

    }
}
