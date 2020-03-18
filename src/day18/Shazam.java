package day18;

import java.util.Scanner;

public class Shazam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hero;
        do {
            System.out.println("Please enter");
            hero = scan.nextLine();
        } while (!hero.equalsIgnoreCase("SHAZAM!"));
        System.out.println("you are now Super Hero!");
    }
}
