package day51.polymorphism;

public class AnimalShow {

    public static void main(String[] args) {


        Animal a1 = new Dog();
        a1.makeNoise();

        a1 = new Horse();
        a1.makeNoise();

        // Dog d1 = new Dog();


    }
}
