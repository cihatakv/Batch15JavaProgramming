package repl.repl76_100;

import java.util.Scanner;

public class BuildARoute_080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        if (start.equals("A") && !end.equals("A")) {
            if (end.equals("B")){
                System.out.println("right: " + end + " found");
            } else if (end.equals("C")){
                System.out.println("right > down: " + end + " found");
            } else if (end.equals("D")){
                System.out.println("right > down > left: " + end + " found");
            }
        } else if (start.equals("B") && !end.equals("B")){
            if (end.equals("C")){
                System.out.println("down: " + end + " found");
            } else if (end.equals("D")){
                System.out.println("down > left: " + end + " found");
            } else if (end.equals("A")){
                System.out.println("down > left > up: " + end + " found");
            }
        } else if (start.equals("C") && !end.equals("C")){
            if (end.equals("D")){
                System.out.println("left: " + end + " found");
            } else if (end.equals("A")){
                System.out.println("left > up: " + end + " found");
            } else if (end.equals("B")){
                System.out.println("left > up > right: " + end + " found");
            }
        } else if (start.equals("D") && !end.equals("D")){
            if (end.equals("A")){
                System.out.println("up: " + end + " found");
            } else if (end.equals("B")){
                System.out.println("up > right: " + end + " found");
            } else if (end.equals("C")){
                System.out.println("up > right > down: " + end + " found");
            }
        }
        if (start.equals(end))
            System.out.println(end + " found");

    }
}
/*
Write a program that will print out route instructions.
Your program should take 2 parameters: start point and end point.
Use left, right, up and down for navigation. Insert ">" between commands.
If start point equals to end point - display: "start/end(start or end variable!) found".
Note: you may move only clock wise.

Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found
 */