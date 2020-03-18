package exercise.random;

import java.util.Scanner;

public class Hypotenuse_Pisagor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter side1: ");
        double side1 = scan.nextDouble();
        System.out.println("Please enter side2: ");
        double side2 = scan.nextDouble();

        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);

        System.out.println("hypotenuse = " + (int) hypotenuse);

    }
}
