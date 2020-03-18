package day33;

import java.util.Scanner;

public class NumberActions {
    public static int getSumFrom1toX(int x){
        int sum = 0;

        for (int i = 1; i <= x; i++) {
            sum += i;
        }

        return sum;
    }

    public static String build_GOT_Email(String firstName, String lastName){

        return firstName.charAt(0) + lastName + "@nightwatch.com";
    }

    public static String got_Email(String fullName){
        String email = "";

        String[] arr = fullName.split(" ");
        email = arr[0].toLowerCase().charAt(0) + arr[1].toLowerCase() + "@nightwatch.com";


        return email;
    }

    public static void main(String[] args) {
        System.out.println(getSumFrom1toX(5));
        System.out.println(build_GOT_Email("cihat","akviranli"));

        String full = "Ali Veli";



        System.out.println(got_Email("John White"));
    }
}
