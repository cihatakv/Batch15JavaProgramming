package day26;

import java.util.Arrays;

public class ToCharArrayPracticeWithArraysClassMethod {
    public static void main(String[] args) {
        // 2 additional String methods related to array
        // toCharArray() , another is split(bySomething)
        String survey = "Complete B15 Online 1 Month Survey";
        char[] surveyChar = survey.toCharArray();
        System.out.println("Before sorting surveyChar = " + Arrays.toString(surveyChar));

        Arrays.sort(surveyChar);

        System.out.println("After sorting surveyChar = " + Arrays.toString(surveyChar));

    }
}
