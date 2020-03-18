package day38;

import java.util.List;
import java.util.ArrayList;

public class TaskFromAkbar {
    public static void main(String[] args) {
        boolean isNumOnly1 = isNumberOnly("34234234");
        System.out.println("isNumOnly1 = " + isNumOnly1);
        boolean isNumOnly2 = isNumberOnly("342G34234");
        System.out.println("isNumOnly2 = " + isNumOnly2);

        List<String> lst = new ArrayList<>();
        lst.add("7644");
        lst.add("9898");
        lst.add("342342");
        lst.add("3402");
        lst.add("37342");
        lst.add("344342");
        lst.add("348342");

        boolean isNumberOnly3 = isNumberList(lst);
        System.out.println("isNumberOnly3 = " + isNumberOnly3);
    }

    public static boolean isNumberOnly(String str) {
        List<Character> lst = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            lst.add(str.charAt(i));
            if (!Character.isDigit(lst.get(i)))
                return false;
        }
        return true;
    }

    public static boolean isNumberList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (isNumberOnly(list.get(i)) == false)
                return false;
        }
        return true;
    }
}
/*
Create a method called isNumberOnly and it accept a String object and
return true if all of its characters are number.

Create another method isNumberList ,
it accepts List<String> object and return true only if all items are number only (use above method)
 */