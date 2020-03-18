package day45;

public class Apple extends Fruit {

    public Apple() {
        // I want to reuse the functionality
        // already written in super class constructor
        // we can use super() or super(arguments here)
        // to call super class's constructor
        // super("abc");
        super("");

    }

    public static void main(String[] args) {

        Apple a1 = new Apple();

    }
}
