package day26;

public class SplitPractice {
    public static void main(String[] args) {
        String survey = "Complete B15 Online 1 Month Survey";
        char[] surveyChars = survey.toCharArray();

        // how did determine to use char for each
        // because each item in char array in char

        for (char each : surveyChars) {
            System.out.println("each char is " + each);
        }

        int i = 0;
        while (i < survey.length()){
            System.out.println("each char is " + surveyChars[i]);
            i++;
        }
        int j = 0;
        do {
            System.out.println("each char is " + surveyChars[j]);
            j++;
        } while (j < survey.length());

    }
}
