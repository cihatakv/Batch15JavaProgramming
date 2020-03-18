package day59;


import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {

        System.out.println("The start");
        String name = "Furkan";
//        System.out.println("number 10 char of name is " + name.charAt(100));
//        System.out.println("name = " + "name");


        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name ?");
        int targetIndex = scan.nextInt();

        try {
            System.out.println(name.charAt(targetIndex));
        } catch (Throwable e) {
            System.out.println(e.toString());
            System.out.println(e.getLocalizedMessage());
            System.out.println("It is out of Bound");
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
