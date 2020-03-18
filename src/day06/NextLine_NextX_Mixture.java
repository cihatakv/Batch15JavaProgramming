package day06;

import java.util.Scanner;

public class NextLine_NextX_Mixture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Name? ");
        String name = scan.nextLine();
        System.out.println("Your name: " + name);

        System.out.println("Your Age");
        int age = scan.nextInt();
        scan.nextLine(); //We are not storing this to a variable we just want to capture Enter keyboard input
        System.out.println("Your age: " + age + "\n");

        System.out.println("Your address: ");
        String address = scan.nextLine();
        System.out.println("Your address: " + address);
    }
}
