package day20;

public class SumOfEvenOddSeperately {
    public static void main(String[] args) {
        int start = 10;
        int end = 100;
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = start; i <=end; i++){
            if (i %2 == 0)
                sumOfEven += i;
            else
                sumOfOdd += i;
        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);
    }
}
