package day23;

public class WarmUoArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 9, 4, 7, 6, 20, 14};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int lastItem = arr[arr.length-1];
        System.out.println("lastItem = " + lastItem);
        System.out.println("Middle item = " + arr[arr.length/2]);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
        double average = sum / arr.length;
        System.out.println("average = " + average);

        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("max = " + max);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("min = " + min);
    }

}
