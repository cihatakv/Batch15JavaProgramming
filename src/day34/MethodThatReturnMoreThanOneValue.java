package day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {

    public static void main(String[] args) {
        int[] resultArr = returnBoysVSGirlsResult();
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] returnBoysVSGirlsResult() {
        int[] boysGirls = {57, 57};
        return boysGirls;
    }
}
