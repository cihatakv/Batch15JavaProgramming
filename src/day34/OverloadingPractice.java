package day34;

public class OverloadingPractice {
    public static void main(String[] args) {
        add(1);
        add(1, 2);
        add(1, 2, 3);
        add(1L, 2L);
    }


    public static void add(int num) {
        System.out.print("First -> ");
        System.out.println(num + 100);
    }

    public static void add(int num1, int num2) {
        System.out.print("Second -> ");
        System.out.println(num1 + num2);
    }

    public static void add(int num1, int num2, int num3) {
        System.out.print("Third -> ");
        System.out.println(num1 + num2 + 3);
    }

    public static void add(long num1, long num2) {
        System.out.print("Forth -> ");
        System.out.println(num1 + num2);
    }
}
