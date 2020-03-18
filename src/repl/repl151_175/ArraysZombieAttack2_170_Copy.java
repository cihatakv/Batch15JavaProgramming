package repl.repl151_175;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysZombieAttack2_170_Copy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
//        for(int i=0; i<inhabitants.length; i++) {
//            inhabitants[i] = input.nextInt();
//        }

        //TODO. Write you code below this line.
        int day = 0;
        int sum = 0;
        do {
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            for (int i = 0; i < 8; i++) {

                if (inhabitants[i] == 0) {
                    if (i != 0 && i != 7) {
                        inhabitants[i - 1] /= 2;
                        inhabitants[i + 1] /= 2;
                        i++;
                    } else if (i == 0) {
                        inhabitants[i + 1] /= 2;
                    } else if (i == 7) {
                        inhabitants[i - 1] /= 2;
                    }
                }
            }
            day++;
            sum = 0;
            for (int each : inhabitants) {
                sum += each;
            }
        } while (sum != 0);
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
    }
}