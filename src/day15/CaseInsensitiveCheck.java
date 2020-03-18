package day15;

import java.util.Scanner;

public class CaseInsensitiveCheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a name");

        String name = scan.nextLine();

        if (name.toUpperCase().contains("ST") || name.toLowerCase().contains("st"))
            System.out.println(name + " contains st without case sensitive");

    }
}
