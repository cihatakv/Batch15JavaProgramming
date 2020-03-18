package day05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

        /*
    Task 3 :
    *  Create an interactive program to ask user for day
    *  and generate minute that day have
    * */


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the # of day to calculate minutes in it : ");

        int numberOfDay = scan.nextInt();

        int minute = numberOfDay * 60 * 24;

        System.out.println("In " + numberOfDay + " , There are " + minute + " minutes");




    /*
    Task 4 :
    *  Create an interactive program to ask user for hourly wage
    *  and generate yearly salary
        assume that he works 2080 hour for a year.
    * */





    }
}
