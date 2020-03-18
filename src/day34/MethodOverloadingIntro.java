package day34;

public class MethodOverloadingIntro {
    public static void sayHello() {
        System.out.println("HEllo");
    }


    public static void main(String[] args) {
        String s = "overloading";

        System.out.println(s.indexOf('r'));
        System.out.println(s.indexOf('o', 2));
    }
}
