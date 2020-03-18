package day26;

public class ArrayTaskNumberTest {
    public static void main(String[] args) {
        int[] score = {156, 101, 76, 187, 87, 110};
        // create a variable  called finalResult to sore
        // your result of checking if every number in this array is more than 100 or not

        String finalResult = ""; // if all numbers are more than 100 make it yes, if not make it no

        // LOGIC 1:
        // take each item check if it is less than 100 count ++, in the end if the count is more than 0 answer is NO

        int count = 0;

        // int[] score = {156, 101, 76, 187, 87, 110};

        System.out.println("LOGIC 1: with FOR LOOP");

        for (int i = 0; i < score.length; i++) {
            if (score[i] < 100)
                count++;
        }
        if (count > 0)
            finalResult = "No";
        else
            finalResult = "Yes";
        System.out.println("finalResult = " + finalResult);

        System.out.println("---------------------------");
        System.out.println("LOGIC 1: with FOR EACH LOOP");

        count = 0;
        for (int each : score) {
            if (each<100)
                count++;
        }
        if (count > 0)
            finalResult = "No";
        else
            finalResult = "Yes";
        System.out.println("finalResult = " + finalResult);



        // LOGIC 2:
        // Check each item and break when the number is less than 100 after assigning final result NO

        System.out.println("===========================");
        System.out.println("LOGIC 2: with FOR EACH LOOP");

        finalResult = "Yes";
        for (int each : score) {
            if (each < 100) {
                finalResult = "No";
                break;
            }
        }
        System.out.println("finalResult = " + finalResult);


        // LOGIC 3:
        // minus 100 from all numbers in array amd if any of the numbers are negative, it will be NO

        // LOGIC 4:
        //
    }
}
