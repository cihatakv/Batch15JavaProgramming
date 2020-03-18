package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {
        String students = "Abbos, Zulyar, Zhibek,Hasan,Muge, Orhan,Susan";
        // first get all the name into String Array called namesArray

        // Spell the name of each person in this format

        String[] namesArray = students.split(",");

        for (int i = 0; i < namesArray.length; i++) {
            namesArray[i] = namesArray[i].trim();
        }

        for (int i = 0; i < namesArray.length; i++) {
            int j = 0;
            String dashedName = "";
            for (j = 0; j < namesArray[i].length() - 1; j++){
                dashedName += namesArray[i].charAt(j) + "-";
            }
            dashedName += namesArray[i].charAt(j);
            System.out.println(dashedName);

        }

        //System.out.println(Arrays.toString(namesArray));



    }
}
