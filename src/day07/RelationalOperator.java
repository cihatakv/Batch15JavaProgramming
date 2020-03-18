package day07;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        System.out.println(7 > 5);
        System.out.println("---------------------");

        Scanner scan = new Scanner(System.in);
        int numericalGrade;
        char a = 'A';
        char b = 'B';
        char c = 'C';
        char d = 'D';
        char f = 'F';


        for (int i = 0; i < 2 ; i++) {
            System.out.println("Please enter your numerical grade which can be only between 0 and 100: ");
            numericalGrade = scan.nextInt();
            if (numericalGrade < 0 || numericalGrade > 100)
                System.out.println("Please Enter a number between 0 and 100");
            else if (numericalGrade >= 90)
                System.out.println("Your Grade: " + a);
            else if (numericalGrade >= 80)
                System.out.println("Your Grade: " + b);
            else if (numericalGrade >= 70)
                System.out.println("Your Grade: " + c);
            else if (numericalGrade >= 60)
                System.out.println("Your Grade: " + d);
            else System.out.println("Your Grade: " + f);
        }






    }
}
