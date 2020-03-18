package day55;

public class Casting {

    public static void main(String[] args) {

        int x = 310;

        byte b = (byte) x;

        Object o = new Dog("Pitbull");

        Dog d = (Dog) o;

        d.bark();
        ((Dog) o).bark();


        System.out.println("==========");


        int a = 383;
        System.out.println((byte) a);


    }

}
