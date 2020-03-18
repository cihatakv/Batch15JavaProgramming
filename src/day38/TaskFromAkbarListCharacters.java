package day38;

import java.util.ArrayList;
import java.util.List;

public class TaskFromAkbarListCharacters {
    public static void main(String[] args) {
        // Create a method that accept String object and
        // return List<Character> that contains each character.
        List<Character> lst = eachCharacter("ABCDEFGH");

        System.out.println("lst = " + lst);
    }

    public static List<Character> eachCharacter(String str) {

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        return list;
    }
}
