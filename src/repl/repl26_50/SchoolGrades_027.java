package repl.repl26_50;

import java.util.Scanner;

// Write the program that will calculate average grade.
public class SchoolGrades_027 {
    public static void main(String[] args) {
        String subject1, subject2, subject3, subject4, subject5, summary; // Declare 6 String variables: subject1,  subject2, subject3,  subject4, subject5, summary;
        double grade1, grade2, grade3, grade4, grade5, average; // Declare 6 double variables: grade1,  grade2, grade3,  grade4, grade5, average;
        Scanner scan = new Scanner(System.in); //-Create a Scanner object named scan.

        System.out.println("Welcome to the Grader!"); // -Display prompt :"Welcome to the Grader!"
        System.out.println("Please enter subject name number 1 and score for this subject");  // -Display prompt: "Please enter subject name number 1 and score for this subject"
        subject1 = scan.next();
        grade1 = scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");   // -Display prompt: "Please enter subject name number 2 and score for this subject"
        subject2 = scan.next();
        grade2 = scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject"); // -Display prompt: "Please enter subject name number 3 and score for this subject"
        subject3 = scan.next();
        grade3 = scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");  // -Display prompt: "Please enter subject name number 4 and score for this subject"
        subject4 = scan.next();
        grade4 = scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject"); // -Display prompt: "Please enter subject name number 5 and score for this subject"
        subject5 = scan.next();
        grade5 = scan.nextDouble();
        System.out.println("Summary: " + subject1 + " - " + grade1 + ", " + subject2 + " - " + grade2 + ", " + subject3 + " - "
                           + grade3 + ", " + subject4 + " - " + grade4 + ", " + subject5 + " - " + grade5); // -build summary variable by concatenating subject names and grades

        average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5; // calculate average score and define that value into average variable.
        System.out.println("Your average score is: " + average); // -Display prompt: "Your average score is: 4.36"
        System.out.println("Thank you for using Grader!"); //-Display prompt: "Thank you for using Grader!"
        System.out.println("Goodbye!");  // -Display prompt: "Goodbye!"

    }
}
