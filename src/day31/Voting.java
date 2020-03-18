package day31;

public class Voting {
    public static void main(String[] args) {
        checkEligibility(15);
        checkEligibility(23);
        checkEligibility(63);
    }

    public static void checkEligibility(int age){
        if (age >= 18)
            System.out.println("Your age is " + age + " You are eligible to vote");
        else
            System.out.println("Your age is " + age + " You are not eligible");
    }
}
