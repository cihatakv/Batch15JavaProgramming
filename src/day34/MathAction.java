package day34;

import day31.Calculator_V2;

import java.util.Arrays;

public class MathAction {
    public static void main(String[] args) {
        int result1 = PracticeMethodWithNumbers.build3DigitNumber(6, 4, 0);
        System.out.println("result1 = " + result1);

        int[] nums = {2, 5, 87};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));


        Calculator_V2.calculate(6, 4, '+');


    }
}
