package day37;

public class SwappingNumbersWithoutTemp {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
        String a = "Hello";
        String b = "World";

        a = a + b;
        b = a.substring(0, a.indexOf(b));
        a = a.substring(b.length());
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
