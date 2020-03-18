package repl.repl126_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInnerAndOuter_134 {
    public static void main(String[] args) {
        int[] inner = {-1, 0, 3, 12};
        int[] outer = {-1, 0, 3, 3, 3, 10, 12};
        int sizeInner = 4;
        int sizeOuter = 7;
//        Scanner scan = new Scanner(System.in);
//        int sizeInner = scan.nextInt();
//        int sizeOuter = scan.nextInt();
//        int[] inner = new int[sizeInner];
//        int[] outer = new int[sizeOuter];
//        for(int i =0; i < sizeInner; i++) {
//            inner[i] = scan.nextInt();
//        }
//        for(int j =0; j < sizeOuter; j++) {
//            outer[j] = scan.nextInt();
//        }


        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE
        String innerBefore = "";
        for (int i = 0; i < sizeInner; i++) {
            innerBefore += inner[i];
        }
        String innerStr = "";
        for (int i = 0; i < sizeOuter; i++) {
            for (int j = 0; j < sizeInner; j++) {
                if (outer[i] == inner[j]) {
                    String jStr = "" + inner[j];
                    if (innerStr.contains(jStr))
                        continue;
                    else {
                        innerStr += inner[j];
                        i++;
                    }
                }
            }
        }
        System.out.println(innerStr.equals(innerBefore));
    }
}
