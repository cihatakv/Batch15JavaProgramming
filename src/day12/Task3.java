package day12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 4; i++){
            System.out.println("Please enter the Number: ");
            num = scan.nextInt();
            if (num %5 == 0 && num %3 == 0 )
                System.out.println(num + " is FizzBuzz Number");
            else if (num %5 == 0 )
                System.out.println(num + " is Fizz Number");
            else if (num %3 == 0 )
                System.out.println(num + " is Buzz Number");
            else
                System.out.println("NOT MY NUMBER!!!");
        }
    }
}
