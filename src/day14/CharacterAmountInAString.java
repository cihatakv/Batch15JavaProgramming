package day14;

import java.util.Scanner;

public class CharacterAmountInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name:");
        String name = scan.nextLine();
        int numberOfACharacter = 0;
        System.out.println("Please enter the character that you want to count in the name above: ");
        char ch = scan.next().charAt(0);

        for (int i = 0; i < name.length(); i++){

            if (name.charAt(i) == ch){
                numberOfACharacter++;
            }


        }
        System.out.println("There is/are " + numberOfACharacter + " 'a' in " + name);

    }

}
