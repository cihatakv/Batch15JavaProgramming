package repl.repl151_175;

import java.util.Scanner;

public class Methods12TimeConversion_157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] split = s.split(":");
        int hour = Integer.parseInt(split[0]);
        if (split[0].equals("12"))
            split[0] = "00";
        else if (Integer.parseInt(split[0]) < 12 && split[2].contains("PM"))
            hour += 12;
        split[2] = split[2].substring(0, 2);
        String strHour = "";
        if (hour < 10)
            strHour = "0" + String.valueOf(hour);
        else
            strHour = String.valueOf(hour);
        System.out.println(strHour + ":" + split[1] + ":" + split[2]);
    }
}
/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 * Function Description
 * It should print a new string representing the input time in 24 hour format.
 * timeConversion has the following parameter(s):
 * s: a string representing time in  12 hour format
 * <p>
 * Input: 07:05:45PM
 * Output: 19:05:45
 */