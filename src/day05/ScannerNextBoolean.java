package day05;

import java.util.Scanner;

public class ScannerNextBoolean {
    public static void main(String[] args) {

        // creating a scanner object
        Scanner input = new Scanner(System.in);

        // asking user are you recording
        System.out.println("are you recording ? ");

        boolean isRecording = input.nextBoolean();

        System.out.println("It is " + isRecording);



    }
}
