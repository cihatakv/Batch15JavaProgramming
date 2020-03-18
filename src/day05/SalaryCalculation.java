package day05;

import java.util.Scanner;

public class SalaryCalculation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your hourly Wage ");

        double hourlyWage = scan.nextDouble();

        double yearlySalary = hourlyWage * 2080;

        System.out.println("Your yearly salary is $" + yearlySalary);
    }
}
