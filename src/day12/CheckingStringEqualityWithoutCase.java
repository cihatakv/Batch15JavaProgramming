package day12;

import java.util.Scanner;

public class CheckingStringEqualityWithoutCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myName = "Cihat";


            System.out.println("Please enter you name: ");
            String name = scan.nextLine();

            if (name.equalsIgnoreCase("Cihat")) {
                if (name.equals("Cihat"))
                    System.out.println(" => You wrote with right Case");
                else
                    System.out.println(" =>You wrote without case");
            } else
                System.out.print("\nYou wrote wrong name !!!");

    }
}
