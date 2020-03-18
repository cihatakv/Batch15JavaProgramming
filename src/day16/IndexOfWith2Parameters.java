package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {

        String name = "I love Java I love Java Java Java";
        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java", 7));
        System.out.println(name.indexOf("Java", 8));
        System.out.println(name.indexOf("Java", 19));
        System.out.println(name.indexOf("Java", 20));
    }
}
