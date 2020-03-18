package day38;

import java.util.ArrayList;
import java.util.List;

public class TaskFromAkbarRemoveElementFromList {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Jo"); // 2
        lst.add("John"); // 4
        lst.add("Jonathan"); // 8
        lst.add("Cihat"); // 5 --->
        lst.add("Maximilianus"); // 12 --->
        lst.add("Averell"); // 7
        lst.add("Bartholomew"); // 11 --->
        lst.add("B"); // 1

        removeElementFromList(lst);
    }

    public static void removeElementFromList(List<String> list1) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).length() < 2)
                list1.remove(i);
            else if (list1.get(i).length() == 5) {
                String reversed = "";
                for (int j = list1.get(i).length() - 1; j >= 0; j--) {
                    reversed += list1.get(i).charAt(j);
                }
                list1.set(i, reversed);
            } else if (list1.get(i).length() > 10)
                list1.set(i, list1.get(i).substring(0, 10));
        }
        System.out.println("list1 = " + list1);
    }
}
/*
Given List of names with various character count,
Remove any name with less than 2 characters
and if any name has more than 10 character only keep 10 characters
and if it has exactly 5 characters , reverse it
Of course , Optionally make a method out of it.
*/