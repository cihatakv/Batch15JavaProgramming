package day27;

public class ArrayTask {
    public static void main(String[] args) {
        /*
        Task01: Find min number for an array without sort method
         */
        int[] scores = {100, 897, 654, 32, 1231, 224, 556, 7, 1, 2, 3, 4};

        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min)
                min = scores[i];
        }
        System.out.println("min = " + min);

        int secondMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < secondMin && scores[i] != min)
                secondMin = scores[i];
        }
        System.out.println("secondMin = " + secondMin);


    }
}
