package day31;

import java.util.Scanner;

public class MethodPractice3 {

    public static void countDownFrom20tillOne() {
        System.out.println("countDownFrom20tillOne");
        for (int i = 20; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printOddNumbers1to100() {
        System.out.println("printOddNumbers1to100");
        for (int i = 0; i <= 100; i++) {
            if (i %2 == 1)
                System.out.print(i + " ");
        }
    }

    public static void nameSpeller() {
        System.out.println("nameSpeller");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String myName = scan.nextLine();
        int i = 0;
        for (i = 0; i < myName.length() - 1; i++) {
            System.out.print(myName.charAt(i) + "-");
        }
        System.out.println(myName.charAt(i));
    }


    public static void main(String[] args) {
        countDownFrom20tillOne();
        printOddNumbers1to100();
        nameSpeller();
    }
}
