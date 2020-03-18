package day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {
        int[] scores = new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 87;

        // Size of an array with property called length
        int itemCount = scores.length;

        for (int x = 0; x < itemCount; x++) {
            System.out.println(scores[x]);
        }

        for (int i = itemCount - 1; i >=0 ; i--) {
            System.out.println(scores[i]);
        }


        System.out.println("==================");
        int[] secondScores = new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;

        System.out.println(scores.length);


    }
}

