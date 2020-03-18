package repl.repl176_200;

public class MethodsWithString1MergeThem_178 {
    public static void main(String[] args) {

    }

    public static String mergeStrings(String one, String two) {


//        int oneLength = one.length();
//        int twoLength = two.length();
//        int longStr = one.length();
//        if (two.length() > longStr)
//            longStr = two.length();
        String mergedString = "";
        for (int i = 0; i < one.length() || i < two.length(); i++) {
            if (i < one.length())
                mergedString += one.charAt(i);
            if (i < two.length())
                mergedString += two.charAt(i);
        }
        return mergedString;

    }
}
