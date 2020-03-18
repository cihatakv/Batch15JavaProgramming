package repl.repl76_100;

import java.util.Scanner;

public class PrefixAgain_099 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String nStr = str.substring(0, n);
        int count = 0;
        String countStr = "";
        boolean exist = false;
        for (int i = 0; i < str.length() - n; i++){
            if (str.substring(i, i + n).equals(nStr))
                count++;
        }
        if (count > 1)
            exist = true;
        System.out.println(exist);
    }
}
