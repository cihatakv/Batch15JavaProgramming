package repl.repl01_25;

import java.util.Scanner;

public class PhoneNum_023 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    int areaCode = scan.nextInt();
    //scan.nextline();
    int localNumber = scan.nextInt();

    String phoneNumber = "(" + areaCode + ")-" + localNumber;

  System.out.println("Calling number " + phoneNumber);
    }
}
