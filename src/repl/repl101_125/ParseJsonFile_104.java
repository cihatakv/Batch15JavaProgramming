package repl.repl101_125;

import java.util.Scanner;

public class ParseJsonFile_104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        int firstNameIndex = json.indexOf("firstName");
        int fnComma = json.indexOf(',', firstNameIndex);

        int lastNameIndex = json.indexOf("lastName");
        int lnComma = json.indexOf(',', lastNameIndex);

        System.out.println("First name: " + json.substring(firstNameIndex + 13, fnComma - 1));
        System.out.println("Last name: " + json.substring(lastNameIndex + 12, lnComma - 1));



    }
}
