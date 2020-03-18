package day11;

import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score;
        for (int i = 1; i < 2; i++) {
            System.out.print("Enter the " + i + ". student's score: ");
            score = scan.nextInt();
            if (score < 0 | score > 100)
                System.out.println("INVALID SCORE");
            else if (score == 100)
                System.out.println("PERFECT SCORE");
            else if (score > 69)
                System.out.println("YOU HAVE PASSED!");
            else if (score < 21)
                System.out.println("Come to my office");
            else if (score < 40 && score > 20)
                System.out.println("Attend additional classes");
            else
                System.out.println("Little bit more study will let you pass");
        }
    }
    }

