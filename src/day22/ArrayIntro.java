package day22;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] scores = new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;


        for (int i = 0; i <4 ; i++) {
            System.out.println(scores[i]);

        }
        if (scores[0] == 95)
            System.out.println("true = " + true);
        else
            System.out.println("false = " + false);

        System.out.println("----------------------\n");

        byte[] data = new byte[4];
        data[0] = 76;
        data[1] = 23;
        data[2] = 34;
        data[3] = 54;

        for (int i = 0; i < data.length ; i++) {
            System.out.println(data[i]);
        }

        data[data.length-1] = -127;
        System.out.println(data[3]);


    }

}

