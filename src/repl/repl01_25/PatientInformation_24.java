package repl.repl01_25;

import java.util.Scanner;

public class PatientInformation_24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //  Create a Scanner object named scan.
        String firstName, lastName, fullName, email, street, state, city, address, contacts;   // Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
        int age, zipcode;  // Declare 2 int variables: age, zipcode
        Double height, weight;  // Declare 2 double variables: height, weight.
        boolean isMarried;  // Declare boolean variable: isMarried (for marriage status).
        long workPhoneNumber, personalPhoneNumber;  // Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

        System.out.println("Welcome to the patient portal!"); // Display prompt "Welcome to the patient portal!"

        System.out.println("Please enter your personal information"); // -Display prompt "Please enter your personal information"

        System.out.println("Enter your first name"); // Display prompt "Enter your first name"
        firstName = scan.nextLine();

        System.out.println("Enter your last name"); // Display prompt "Enter your last name"
        lastName = scan.nextLine();

        System.out.println("Enter your email"); // Display prompt "Enter your email"
        email = scan.nextLine(); // Display prompt "Enter your email"

        System.out.println("Enter your street"); // Display prompt "Enter your street"
        street = scan.nextLine();

        System.out.println("Enter your city"); // Display prompt "Enter your city"
        city = scan.nextLine();

        System.out.println("Enter your state"); // Display prompt "Enter your state"
        state = scan.nextLine();

        System.out.println("Enter your zip code"); // Display prompt "Enter your zip code"
        zipcode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your work phone number"); // Display prompt "Enter your work phone number"
        workPhoneNumber = scan.nextLong();
        scan.nextLine();

        System.out.println("Enter your personal phone number"); // -Display prompt "Enter your personal phone number"
        personalPhoneNumber = scan.nextLong();
        scan.nextLine();

        System.out.println("Enter your age"); // -Display prompt "Enter your age"
        age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your height"); // -Display prompt "Enter your height"
        height = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter your weight"); // -Display prompt "Enter your weight"
        weight = scan.nextDouble();
        scan.nextLine();

        System.out.println("Are you married?"); // -Display prompt "Are you married?"
        isMarried = scan.nextBoolean();
        scan.nextLine();

        contacts = "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email;
        fullName = firstName + " and " + lastName;
        address = street + ", " + city + ", " + state + " " + zipcode;

        System.out.println("Patient personal information"); // Patient personal information

        System.out.println("Full name: " + lastName + ", " + firstName); // Full name:

        System.out.println("Address: " + address); // Address

        System.out.println("Contacts: " + contacts); // contacts

        System.out.println("Age: " + age);

        System.out.println("Height: " + height);

        System.out.println("Weight: " + weight + " pounds");

        System.out.println("Married?: " + isMarried);

    }
}
