package repl.repl26_50;

import java.util.Scanner;

public class Citizens036 {
    public static void main(String[] args) {
        int seniorCitizens, nonSeniorCitizens, age; //Declare int variables: seniorCitizens, nonSeniorCitizens, age
        Scanner scan = new Scanner(System.in); //Create a Scanner object
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:"); //Ask user to enter count for seniorCitizens and nonSeniorCitizens using message
        seniorCitizens = scan.nextInt();
        nonSeniorCitizens = scan.nextInt();

        System.out.println("What is new citizen's age?"); //Ask user to enter age:
        age = scan.nextInt();
        if (age >= 65){
            System.out.println("Senior Citizen");
            seniorCitizens++;
        }
        else {
            System.out.println("Non-Senior Citizen");
            nonSeniorCitizens--;
        }
        System.out.println("New seniorCitizens count " + seniorCitizens);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);

    }
}

/*
-if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

-if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

-At last, print another message:
"New seniorCitizens count ValueOfVariable"
"New nonSeniorCitizens count ValueOfVariable"

Example Run:

Enter current count for seniorCitizens and nonSeniorCitizens:
5
4
What is new citizen's age?
66
Senior Citizen
New seniorCitizens count 6
New nonSeniorCitizens count 4
* */