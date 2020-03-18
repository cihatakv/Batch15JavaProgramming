package day54;

public class AnimalShow {
    public static void main(String[] args) {
        // Dog IS-A Dog
        // Dog IS-A Animal
        // Dog IS-A Object
        // Dog IS-A IndoorPet

        // refer a dog object as a animal
        // it can do everything a dog can do
        Dog d1 = new Dog();
        System.out.println(d1.name);
        d1.play();
        Animal a1 = d1;
        a1.speak();

        Object o1 = d1;
        // o1.speak(); // object doesn't speak. There is no speak method in object class

        IndoorPet p1 = d1;
        p1.play();


    }
}
