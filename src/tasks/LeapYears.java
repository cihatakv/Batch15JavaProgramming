package tasks;

public class LeapYears {
    public static void main(String[] args) {

        int[] leaps = {1600, 1700, 1800, 1804, 2000, 1200, 1300, 1100};

        for (int leap : leaps) {
            System.out.println(leap + "leap = " + isLeapYear(leap));
        }
    }

    public static boolean isLeapYear(int year) {
        //TODO Your codes here

        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else if (year % 4 == 0)
            return true;
        else
            return false; //return correct result
    }
}
/*
In the Gregorian calendar three criteria must be taken into account to identify leap years:
The year can be evenly divided by 4;
If the year can be evenly divided by 100, it is NOT a leap year, unless;
The year is also evenly divisible by 400.  Then it is a leap year.
Write a method

 */
