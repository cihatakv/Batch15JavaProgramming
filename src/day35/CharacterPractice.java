package day35;

public class CharacterPractice {


    public static void main(String[] args) {

        // Character class has lots of static methods
        // to perform actions on char values
        // isDigit, isLetter, isLetterOrDigit, isUpperCase, isLowerCase
        // toUpperCase, toLowerCase

        System.out.println("IS DIGIT METHOD PRACTICE");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";
        // Get the number out of this String
        // and store it into Integer varable x;

        String strDigit = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println("str.charAt(" + i + ") = " + str.charAt(i));
                strDigit += str.charAt(i);
            }
        }
        System.out.println("strDigit = " + strDigit);
        Integer num = Integer.valueOf(strDigit);
        System.out.println("num = " + num);


//        System.out.println("\n-----------CHARACTER-----------------");
//
//        Character charObject = Character.valueOf('a');
//        System.out.println("Get Character Object-> Character.valueOf('a') = " + Character.valueOf('a') );
//        System.out.println("Character.isDigit('7') = "      + Character.isDigit('7'));
//        System.out.println("Character.isLetter('A') = "     + Character.isLetter('A'));
//        System.out.println("Character.isLetterOrDigit(' ') = " + Character.isLetterOrDigit(' '));
//        System.out.println("Character.isUpperCase('a') = "  + Character.isUpperCase('a'));
//        System.out.println("Character.isLowerCase('b') = "  + Character.isLowerCase('b'));
//        System.out.println("Character.toUpperCase('a') = "  + Character.toUpperCase('a'));
//        System.out.println("Character.toLowerCase('A') = "  + Character.toLowerCase('A'));


    }
}
