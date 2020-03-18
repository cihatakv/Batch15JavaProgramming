package repl;

import java.util.Scanner;

public class TipCalculator_051 {
    public static void main(String[] args) {Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String splitNoSplit = scan.next();
        System.out.println("Number of people:");
        int noOfPeople = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = scan.next();
        double totalTip = 0;
        double total = checkAmount;
        // double tipPerPerson = 0;
        int i = 1;
        String strNoOfPeople = "";
        while (i <= noOfPeople) {
            strNoOfPeople += "&";
            i++;
        }
        if (splitNoSplit.equals("Yes")){
            System.out.println("Number of people entered: " + strNoOfPeople);  // Number of people entered: &&&&
            if (serviceQuality.equals("Excellent")) {
                totalTip = checkAmount * 0.25;
            } else if (serviceQuality.equals("Great")){
                totalTip = checkAmount * 0.2;
            } else if (serviceQuality.equals("Good")) {
                totalTip = checkAmount * 0.15;
            } else if (serviceQuality.equals("Fair")) {
                totalTip = checkAmount * 0.10;
            } else if (serviceQuality.equals("Poor")) {
                totalTip = checkAmount * 0.05;
            }
            total += totalTip;
            System.out.println("Total to pay: " + total);             // Total to pay: 595.0
            System.out.println("Total tip: " + totalTip);                              // Total tip: 119.0
            System.out.println("Total per person: " + ((totalTip + checkAmount)/noOfPeople));    // Total per person: 148.75
            System.out.println("Tip per person: " + (totalTip / noOfPeople));    // Tip per person: 29.75
        }
    }
}
/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */