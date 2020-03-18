package day59;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {
    public static void main(String[] args) {

        System.out.println("The start");
        String name = "Furkan";
//        System.out.println("number 10 char of name is " + name.charAt(100));
//        System.out.println("name = " + "name");


        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name ?");


        while (true) {
            try {
                int targetIndex = scan.nextInt();
                System.out.println(name.charAt(targetIndex));
                System.out.println("end of try");
                break;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Something unusual happen!!! Please enter 0-5");
            } catch (InputMismatchException i) {
                System.out.println("Input mismatch, enter number!!");
                scan.nextLine();

            }
        }

        System.out.println("The End");

//
//        StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
//
//        System.out.println(e1.toString());


//
//        int high = 2100000000;
//        int low = 2000000000;
//        System.out.println("mid using >>> 1 = " + ((low + high) >>> 2));
//        System.out.println("mid using / 2   = " + ((low + high) / 2));

    }
}
