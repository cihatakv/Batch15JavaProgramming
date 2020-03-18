package day14;

import java.util.Scanner;

public class StringCharAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name;
        name = scan.nextLine();
        for (int i = 0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }

    }
}
