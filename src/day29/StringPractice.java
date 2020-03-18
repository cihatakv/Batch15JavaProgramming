package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String hero1 = "Superman-Clark Kent";
        // Task :
        // Hero code is Superman and Identity is CLark Kent
        // The Initial of the Hero is CK

        // LOGIC 1 : split this String by dash -
        // to get 2 pieces of String into a String array

        String[] heroSplitted = hero1.split("-");

        System.out.println("heroSplitted = " + Arrays.toString(heroSplitted));

        // Hero code is Superman and Identity is Clark Kent

        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];
        System.out.println("Hero code is " + heroCode + " and Identity is " + fullName);

        // The initial of the Hero is CK
        //I can just use fullname variable to finish this task

        // LOGIC 1 : get the first latter of fullname then get the letter after the space

        System.out.println(fullName.charAt(0) + fullName.substring((fullName.lastIndexOf(" ") + 1), (fullName.indexOf(" ") + 2)));

        // LOGIC 2 : We already have full name stored in fullName variable
        // split by space -->> we will get firstName (middle name ) lastName

        // get the first letter of full name

        // get the first character of the last index of splitted array

        String[] fullNameSplitted = fullName.split(" ");

        System.out.println(fullNameSplitted[0].charAt(0) + "" + fullNameSplitted[fullNameSplitted.length - 1].charAt(0));


    }
}
