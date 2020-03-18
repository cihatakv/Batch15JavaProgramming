package mentoring;

import java.util.Scanner;

public class Repl76WithAhmet {

    public static void main(String[] args) {
        //      01234567890123
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int indexOfUnderscore = email.indexOf("_");
        if (email.contains("_")) {
            String first = email.substring(0, email.indexOf("_"));
            String last = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));
            System.out.println(last + "_" + first + domain);
        } else {
            System.out.println(email);
        }

        email.substring(1, 3);


    }
}
/*
In this task, you need to swap first name with last name in the email.
If email doesn't contains underscore - do not anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
 */