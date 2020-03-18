package day16;

import java.util.Scanner;

public class GiveMeFiveWithWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber = 0;

        while (userNumber != 5){
            System.out.println("GIVE ME FIVE !!");
            userNumber = scan.nextInt();
        }
        System.out.println("I got 5");
        }
    }

