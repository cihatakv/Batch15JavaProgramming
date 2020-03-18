package day11;

public class StringEquality {
    public static void main(String[] args) {
        String name = "Cihat";
        int i = 1;
        String name2 = new String("Cihat");
        System.out.println(name2);
        String name3 = "Cihat";
        System.out.println(name3);

        System.out.println(name == name2);
        System.out.println(name == name3);

        System.out.println("USING EQUALS METHODS");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));



    }
}
