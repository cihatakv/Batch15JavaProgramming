package repl.repl176_200;

import java.util.ArrayList;
import java.util.List;

public class Repl_193 {
    public static String combineRs(String[] r1, String[] r2) {
        List<String> lst = new ArrayList<>();

        for (String each : r1)
            lst.add(each);

        // lst.add("*");
        for (String each : r2)
            lst.add(each);


        String combined = lst.toString();
        combined = combined.replace(", ", "");
        return combined.substring(1, combined.length() - 1);


//        String lstString = teamMates.toString();
//        System.out.println(lstString.replace(", ", "-"));
//        System.out.println(lstString.substring(1, lstString.length() - 1));


    }

    public static void main(String[] args) {

    }
}


