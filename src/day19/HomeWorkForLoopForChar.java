package day19;

import java.util.Scanner;

public class HomeWorkForLoopForChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter starting letter: ");
        char starting = scan.nextLine().charAt(0);
        System.out.print("Please enter ending letter: ");
        char ending = scan.nextLine().charAt(0);


        for (int i = starting; i <= ending; i++)
            System.out.println(starting++ + " ");
//        for(char i=starting; i<ending ; i--){
//            System.out.println(starting+""+ending);   // Check this line
//        }

    }
}
