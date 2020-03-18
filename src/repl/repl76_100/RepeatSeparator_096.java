package repl.repl76_100;

import java.util.Scanner;

public class RepeatSeparator_096 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        if (count == 1)
            System.out.println(word);
        else {
            for (int i = 1; i < count; i++)
                System.out.print(word + separator);
            System.out.print(word);
        }
    }
}
