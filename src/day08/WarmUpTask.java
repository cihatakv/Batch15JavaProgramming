package day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {

        int age;
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
        scan.nextLine();
        if ( age >= 18 )
            System.out.println("You are ready to vote !!!");
        else
            System.out.println("Wait until you are 18");
        }
}
