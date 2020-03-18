package day33;

public class WarmUp {
    public static String getSpelledName(String strName) {
        String spelledName = "";
        for (int i = 0; i < strName.length(); i++) {
            spelledName += strName.charAt(i) + "-";
        }
        spelledName = spelledName.substring(0, spelledName.length()-1);

        return spelledName;
    }

    public static void main(String[] args) {
        String dashedSpelledName = getSpelledName("Cihat");
        System.out.println("dashedSpelledName = " + dashedSpelledName);
    }

}
