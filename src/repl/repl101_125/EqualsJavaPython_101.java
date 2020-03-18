package repl.repl101_125;

import java.util.Scanner;

public class EqualsJavaPython_101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int javaCount = 0;
        int pythonCount = 0;
        boolean equalOrNot = false;

        for (int i = 0; i < sentence.length() - 4; i++){
            if (i < sentence.length() - 4 && sentence.substring(i, i + 4).equals("java"))
                javaCount++;
             else if (i < sentence.length() - 5 && sentence.substring(i, i + 6).equals("python"))
                pythonCount++;
        }
        System.out.println(javaCount == pythonCount);


    }
}
/*
Given a string, print out true if the number of
appearances of "java" anywhere in the string is
equal to the number of appearances of "python"
anywhere in the string (case sensitive).
 */