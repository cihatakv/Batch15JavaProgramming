package day20;

public class ReversingAString {
    public static void main(String[] args) {
        String name = "Cihat";
        String reversedName = "";

        for (int i = name.length()-1; i >=0; i--) {
            System.out.print(name.charAt(i));
            reversedName += name.charAt(i);
        }
        System.out.println("\n\n");
        System.out.println("reversedName = " + reversedName);
    }
}
