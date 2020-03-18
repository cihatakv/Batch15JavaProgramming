package zAdvanceAlgorithm;

import java.util.Scanner;

public class LeastCommonMultipleByMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        int gcd = 1;
        int lcm = 1;

        for (int i = 1; i <= firstNum; i++) {
            if (firstNum % i == 0 && secondNum % i == 0)
                gcd = i;
        }
        System.out.println("gcd = " + gcd);
        for (int i = firstNum; i < firstNum * secondNum; i++) {
            if (i % firstNum == 0 && i % secondNum == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("lcm = " + lcm);

    }
}
