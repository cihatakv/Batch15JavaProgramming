package day37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class ArrayList_LoopPractice {
    public static void main(String[] args) {
        ArrayList<String> nameLst = new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        System.out.println("nameLst = " + nameLst);

        String longestString = nameLst.get(0);
        for (String currentName : nameLst) {
            if (currentName.length() > longestString.length())
                longestString = currentName;
        }
        System.out.println("longestString = " + longestString);
        List<String> subList = nameLst.subList(2, 4);
        System.out.println("subList = " + subList);

        ArrayList<String> nameLst2 = new ArrayList<String>();
        nameLst2.add("Qalbinur");
        nameLst2.add("Ruzi");
        nameLst2.add("Sabahiddin");
        nameLst2.add("Guzelnurin");
        nameLst2.add("Muyesser");
        nameLst2.add("Mustafa");
        System.out.println("nameLst2 = " + nameLst2);
        System.out.println("================");
        String longestName = nameLst2.get(0);
        for (String currentName : nameLst2) {
            if (currentName.length() > longestName.length())
                longestName = currentName;
        }


        for (String s : nameLst2) {
            if (s.length() == longestName.length())
                System.out.println(s);
        }


    }
}
