package day17;

import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String name = scan.nextLine();
        int i = 0;
        String newName = "";
        while (i <= name.length() - 2 ){
            newName += name.charAt(i) + "*";
            i++;
        }
        newName += name.charAt(i) + "";
        System.out.println("newName = " + newName);
    }
}
