package repl.repl151_175;

import java.util.Scanner;

public class Methods10PrintNext3Numbers_155 {
    public static void next3(int n) {
        int m = n + 1;
        for (int i = m; i <= m + 2; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);
    }


}
/*
Create a method called next3 .
This method gets an int argument and prints the
next 3 numbers after that number.
Call the method from main method and pass num to it.

enter number
1
next 3 are:
2 3 4

(put a space between numbers)
 */