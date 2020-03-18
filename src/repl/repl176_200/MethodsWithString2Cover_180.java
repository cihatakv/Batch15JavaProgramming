package repl.repl176_200;

public class MethodsWithString2Cover_180 {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me")); //java [me]thods
        System.out.println(coverString("java methods", "me")); // ==> "java [me]thods"
        System.out.println(coverString("Certified Wooden Spoon", "o")); //  ==> "Certified W[o][o]den Sp[o][o]n"
        System.out.println(coverString("hello hello", "ello")); // ==> // "h[ello] h[ello]"
        // System.out.println(coverString("apples", "pears") ) ; //==> "[apples]"
    }

    public static String coverString(String main, String coverME) {
        String result = "";
        for (int i = 0; i < main.length(); i++) {
            if (main.substring(i).length() > coverME.length() - 1) {
                if (!main.substring(i, (i + coverME.length())).equals(coverME)) {
                    result += main.charAt(i);
                } else {
                    result += "[" + coverME + "]";
                    i += (coverME.length() - 1);
                }
            }
//            else {
//                result += main.substring(i);
//                return result;
//            }
        }
        return result;
    }
}
