package repl.repl101_125;

import java.util.Scanner;

public class ArraysPrintShortestWord_125 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        int shortestCount = str[0].length();
        String shortestStr = "";
        for (String eachStr : str){
            if (eachStr.length() < shortestCount) {
                shortestCount = eachStr.length();
                shortestStr = eachStr;
            }
        }
        System.out.println(shortestStr);

    }
}
/*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace
output: red
 */