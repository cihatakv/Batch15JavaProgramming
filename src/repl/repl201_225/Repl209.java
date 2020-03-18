package repl.repl201_225;

public class Repl209 {
    public static void main(String[] args) {
        System.out.println(extractNum("aa2aa3"));
    }

    public static String extractNum(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i)))
                result += "" + s.charAt(i);

        }

        return result;

    }
}
