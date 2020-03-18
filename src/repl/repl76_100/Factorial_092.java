package repl.repl76_100;

import java.util.Scanner;

public class Factorial_092 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long factorial = 1L;
        for (long i = 1; i <= n; i++)
            factorial *= i;
        System.out.println(factorial);
    }
}
