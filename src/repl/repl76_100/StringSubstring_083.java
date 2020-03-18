package repl.repl76_100;

import java.util.Scanner;

public class StringSubstring_083 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        String newTxt = "";
        int i = 0;
        while (i < 2) {
            System.out.print(txt.substring(i, i + 1));
            i++;
        }
    }
}
/*
using substring method output the first to letters of txt string
for examole:
String txt = "foo"
the first two letters are "fo"
 */
