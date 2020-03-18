package day52.polymorphism;

public class ShapePolymorphism {
    public static void main(String[] args) {

        Circle c1 = new Circle("penny", 5);
        // Shape s1 = new Circle("penny", 5);
        Object o1 = new Circle("penny", 5);
        Drawable d1 = new Circle("penny", 5);

        Object s1 = new Circle("penny", 5);
        c1.draw();
        // s1.draw();
        // o1.draw();
        d1.draw();

        System.out.println(s1.getClass().getSimpleName());

    }
}
