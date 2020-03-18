package day05;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the degree in Fahrenheit to convert to Celsius : ");

        double fahrenheit = scan.nextDouble();

        double celsius = (5 / 9.0) * (fahrenheit - 32);

        System.out.println(fahrenheit + "F = " + celsius + "C");


    }
}
