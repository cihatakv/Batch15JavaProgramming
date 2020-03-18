package day36;

public class MethodWithParameter {
    public static void main(String[] args) {
        addOneHundred(Integer.valueOf("25"));


        Integer a = 5;
        Integer b = a;
        b = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void addOneHundred(int x) {
        System.out.println(x + 100);
    }
}
