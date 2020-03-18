package day32;

import java.util.Arrays;

public class ArrayPracticeMethod {
    public static void main(String[] args) {

        int[] arr = {61, 82, 92, 64};
        printArrayItems(arr);
        printMaxOfIntArray(arr);
        printMinOfIntArray(arr);
        printSumOfIntArray(arr);
        checkScoresAllMoreThan60(arr);

        String[] strArr1 = {"ali", "veli"};
        String[] strArr2 = {"cihat", "kerem", "yahya"};
        compare2arraySize(strArr1,strArr2);
        compare2arraySize(new String[]{"John", "White"},new String[]{"Ker","yah"});

    }

    public static void compare2arraySize(String[] arr1, String[] arr2){
        if (arr1.length > arr2.length)
            System.out.println("Array 1 has more items");
        else if (arr2.length > arr1.length)
            System.out.println("Array 2 has more items");
        else
            System.out.println("They have same item count");
    }

    public static void printArrayItems(int[] nums) {
        System.out.println("Array has items : " + Arrays.toString(nums));
    }

    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array
    public static void printMaxOfIntArray(int[] nums) {
        int max = nums[0];
        for (int eachNum : nums) {
            if (eachNum > max)
                max = eachNum;
        }
        System.out.println("Max = " + max);
    }

    // printMinOfIntArray
    // this method has one int array as parameter
    // and it will print the min number inside the array
    public static void printMinOfIntArray(int[] nums) {
        int min = nums[0];
        for (int each : nums) {
            if (each < min)
                min = each;
        }
        System.out.println("Min = " + min);
    }

    // printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all the numbers
    public static void printSumOfIntArray(int[] nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        System.out.println("Sum = " + sum);
    }
    // OPTIONALLY
    // checkScoresAllMoreThan60
    // this method has one int array as parameter
    // and it will check whether each and every numbers are more than 60
    // if so print everyone passed
    // if not print someone has failed

    public static void checkScoresAllMoreThan60(int[] nums) {
        int count = 0;
        for (int each : nums) {
            if (each < 60) {
                break;
            }
            else
                count++;
        }
        if (count == nums.length)
            System.out.println("everyone passed");
        else
            System.out.println("someone has failed");
    }


}



