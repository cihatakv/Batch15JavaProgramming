package day20;

public class SumOfOdd {
    public static void main(String[] args) {
        int start = 10;
        int end = 100;
        int sum = 0;

        for (int i = start; i  <=end; i++) {
            if (i %2 == 1)
                sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
