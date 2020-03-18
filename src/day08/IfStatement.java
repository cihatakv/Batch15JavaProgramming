package day08;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        int yourSpeed, speedLimit;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your current speed? ");
        yourSpeed = scan.nextInt();
        System.out.println("What is the speed limit? ");
        speedLimit = scan.nextInt();

        if ( yourSpeed >= speedLimit ) {
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        }
        System.out.println("THE END OF THE STORY !!! MOVE ON !!!");

    }
}
