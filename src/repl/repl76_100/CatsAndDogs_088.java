package repl.repl76_100;

import java.util.Scanner;

public class CatsAndDogs_088 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.nextLine();
        int countOfCats = 0;
        int countOfDogs = 0;;
        int index = word.length();

        for (int i = 0; i < index - 2; i++){
            if (word.substring(i, i + 3).equalsIgnoreCase("cat"))
                countOfCats++;
            else if (word.substring(i, i + 3).equalsIgnoreCase("dog"))
                countOfDogs++;
        }
        System.out.println(countOfCats==countOfDogs);
    }
}
