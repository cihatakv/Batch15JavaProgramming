package repl.repl26_50;

import java.util.Scanner;

public class BurgerAndChicken_050 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String in = s.next();

        //your code here

        float price = 10.0f;

        if (in.equals("burger") || in.equals("chicken"))
            System.out.println(price);
        if (in.equals("soda"))
            System.out.println(2.0);
    }
}
