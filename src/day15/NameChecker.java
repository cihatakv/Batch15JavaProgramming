package day15;

public class NameChecker {
    public static void main(String[] args) {
        String name = "Cihat";
        int length = name.length();
        if (length < 4)
            System.out.println("Short Name");
        else if (length <= 11)
            System.out.println("medium Name");
        else
            System.out.println("Longer name");

        if (name.contains("a") || name.contains("e"))
            System.out.println("name contains a or e");
        else
            System.out.println("I don't have a or e in my name");

        for (int i = length - 1 ; i >= 0 ; i--)
            System.out.print(name.charAt(i));
    }
}
