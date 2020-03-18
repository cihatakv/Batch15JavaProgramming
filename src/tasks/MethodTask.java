package tasks;

import java.util.Scanner;

public class MethodTask {
    public static void main(String[] args) {
        reversePrintMyOwnName();
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any name to reverse");
        String anyName = scan.nextLine();
        reversePrintAnyName(anyName);
        System.out.println();
        System.out.println("Please enter First Name: ");
        String firstName = scan.nextLine();
        System.out.println("Please enter Last Name: ");
        String lastName = scan.nextLine();
        printFullNameInformation(firstName, lastName);
        System.out.println();
        System.out.println("Please enter a name to show the last Character of it: ");
        String name = scan.nextLine();
        printLastCharacterOfName(name);
        System.out.println();
        System.out.println("Please enter 2 name to compare the lengths");
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        compareNameCharacterCount(name1, name2);
        System.out.println();
        printAtoZ();
        System.out.println();
        printZtoA();
        System.out.println();
        System.out.println("Please enter beginning char: ");
        char beginChar = scan.nextLine().charAt(0);
        System.out.println("Please enter ending char: ");
        char endChar = scan.nextLine().charAt(0);
        printAlphabetInRange(beginChar, endChar);
    }

    /*
     * reversePrintMyOwnName
     * create a method that has no parameter
     * and print your name in reversed order
     */
    public static void reversePrintMyOwnName() {
        String myName = "Cihat";
        for (int i = myName.length() - 1; i >= 0; i--) {
            System.out.print(myName.charAt(i) + " ");
        }
    }

    /*
     * reversePrintAnyName
     * create a method that has 1 String parameter called name
     * and print that name in reversed order
     */
    public static void reversePrintAnyName(String anyName) {
        for (int i = anyName.length() - 1; i >= 0; i--) {
            System.out.print(anyName.charAt(i) + " ");
        }
    }

    // printLastCharacterOfName
    // create a method that has 1 String parameter called name
    // and print last character of that name

    public static void printLastCharacterOfName(String name) {
        System.out.println(name.charAt(name.length() - 1));
    }

    //printFullNameInformation
    //* create a method that has 2 String parameter called firstName,lastName
    //	and print "Your first name is firstName , Your last Name is lastName
    //		print " your full name length is lengthOfTheFullName"
    public static void printFullNameInformation(String fName, String lName) {
        System.out.println("Your first is " + fName + " , Your last name is " + lName);
        System.out.println("Your full name length is " + (fName.length() + lName.length()));
    }


    //compareNameCharacterCount
    //* create a method that has 2 String parameter called name1,name2
    //	if name 1 has more characters
    //		 print " name 1 is longer "
    //	if name 2 has more characters
    //		 print " name 2 is longer "
    //	if name 2 has same character count
    //		 print " name 1 and name 2 same character count "

    public static void compareNameCharacterCount(String name1, String name2) {
        if (name1.length() > name2.length())
            System.out.println(name1 + " is longer");
        else if ((name2.length() > name1.length()))
            System.out.println(name2 + " is longer");
        else
            System.out.println(name1 + " and " + name2 + " have same character count");
    }

    //printAtoZ
    //* create a method that has no parameter
    //	and print A-Z in one line
    public static void printAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }

    //printZtoA
    //* create a method that has no parameter
    //	and print Z-A in one line
    public static void printZtoA() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
    }

    //printAlphabetInRange
    //* create a method that have 2 char as parameters: beginning, ending
    //if beginning character is before ending character
    //	for example beginning A , ending D  -->> ABCD
    //if beginning character is after ending character
    //	for example beginning D , ending A  -->> DCBA

    public static void printAlphabetInRange(char beginning, char ending) {
        if (beginning < ending) {
            for (char i = beginning; i <= ending; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = ending; i >= beginning; i--) {
                System.out.print(i + " ");
            }
        }
    }
}