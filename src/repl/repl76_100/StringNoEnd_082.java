package repl.repl76_100;

import java.util.Scanner;

public class StringNoEnd_082 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        int length = txt.length() - 1;
        int i = 0;

        while (i < length) {
            System.out.print(txt.charAt(i));
            i++;
        }

    }
}
/*
In this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo

 */