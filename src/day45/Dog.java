package day45;
//OVERLOADING VS OVERRIDING
//Overloading :same method name & different parameter in the same class
//Overriding : parent child relationship is a MUST
//has same method name signature & same parameter list ALWAYS

public class Dog extends Animal {


    public static void main(String[] args) {
        Dog rasty = new Dog();
        rasty.speak();
        Animal a1 = new Animal();

    }

    @Override
    public void speak() {
        System.out.println("BARK!@@");
    }
}
