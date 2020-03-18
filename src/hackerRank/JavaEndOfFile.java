package hackerRank;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int cnt = 1;
        while (!s.contains("end-of-file") && scan.hasNextLine()) {
            System.out.println(cnt + " " + s);
            s = scan.nextLine();

            cnt++;
        }
        System.out.println(cnt + " " + s);

    }
}
/**
 * 1 Hello world
 * 2 I am a file
 * 3 Read me until end-of-file.
 */