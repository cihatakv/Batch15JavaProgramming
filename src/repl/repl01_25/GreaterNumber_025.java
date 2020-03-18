package repl.repl01_25;

import java.util.*;

public class GreaterNumber_025 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (b > a){
            System.out.println(b + " is greater");
        }
        else {
            System.out.println(a + " is greater");
        }
    }
}
