package day09;

import java.util.Scanner;

public class LanguagePicker {
    public static void main(String[] args) {
        int languageNumber;
        Scanner scan = new Scanner(System.in);

        languageNumber = scan.nextInt();
        String language = "";

        if ( languageNumber == 1 )
            language = "Hello";
        else if ( languageNumber == 2 )
            language = "Salam";
        else if ( languageNumber == 3 )
            language = "Hola";
        else if ( languageNumber == 4 )
            language = "Privet";
        else if ( languageNumber == 5 )
            language = "Merhaba";
        else if ( languageNumber == 6 )
            language = "Szia";
        else if ( languageNumber == 7 )
            language = "Bonjour";

        System.out.println(language + ", SDET");

    }
}
