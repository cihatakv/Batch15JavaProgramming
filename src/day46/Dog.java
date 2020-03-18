package day46;
// OVERLOADING VS OVERRIDING
// Overloading :same method name & different parameter in the same class
// Overriding : parent child relationship is a MUST
// has same method name signature & same parameter list ALWAYS

public class Dog extends Animal {
    // public void speak() {
    //        System.out.println("Animal speak");
    //    }

    public static void main(String[] args) {
        Dog rasty = new Dog();
        rasty.speak();
    }

    @Override
    public void speak() {
        System.out.println("Test");
        // walk();
        // super.walk();
        // walk2();

        super.speak();

        System.out.println("BARK!@@");
//        super.speak();
//        super.speak();
    }

//    @Override
//    public void walk() {
//        System.out.println("Child walking");
//    }
//
//    public void walk2() {
//        System.out.println("Child walking");
//    }
}
