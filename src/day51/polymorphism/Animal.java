package day51.polymorphism;

public class Animal {


    public void makeNoise() {
        System.out.println("General Animal Noise");
    }

}

class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("WOOF!!!!");
    }
}

class Horse extends Animal {

    public void makeNoise() {
        System.out.println("NEINEI!!!!");
    }
}
