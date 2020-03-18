package repl.repl76_100;

import java.util.Scanner;

public class CountJava_097_Copy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        // java
        // xjavaxjavaapplepearjavaegg
        //  01234
        String s = "Hello";

        int javaCounter = 0;
        for (int i = 0; i < word.length() - 3; i++) {
            if (word.substring(i, i + 4).equals("java"))
                javaCounter++;
        }
        System.out.println(javaCounter);

        // System.out.println(s.substring(1, 4));


    }
}
