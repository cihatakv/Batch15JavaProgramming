package day17;

import java.util.Scanner;

public class WakeUp_FullNameCorrector {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fullName = scan.nextLine();

        String firstName = fullName.substring(0,fullName.indexOf(" "));
        String lastName= fullName.substring(fullName.indexOf(" ") + 1);

        String firstNameCorrected = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);

        System.out.print(firstNameCorrected + " ");

        String LastNameCorrected = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);

        System.out.println(LastNameCorrected);



    }
}
