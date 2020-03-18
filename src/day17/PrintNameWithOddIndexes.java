package day17;

import java.util.Scanner;

public class PrintNameWithOddIndexes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        int i = 0;
        while (i < name.length()){
            if (i %2 == 1)
                System.out.print(name.charAt(i));
            i++;
        }


    }
}
