package repl.repl76_100;

import java.util.Scanner;

public class Email_076 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName = "";
        String lastName = "";
        if (email.contains("_")){
            firstName += email.substring(0, email.indexOf("_"));
            lastName += email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            System.out.println(lastName + "_" + firstName + email.substring(email.indexOf("@"), email.length()));
        }
        else
            System.out.println(email);
    }
}
