package day52.polymorphism;

public class ShapePolymorphism2 {
    public static void main(String[] args) {

        Shape s1 = new Circle("penny", 5);

        printAnyShapeArea(s1);

        Shape s2 = new Rectangle("Book", 10, 5);

        printAnyShapeArea(s2);

        printAnyShapeArea(new Square("Dice", 5));

        drawShape3Times(s2);
        drawShape3Times(new Circle("Bob", 6));

    }

    public static void printAnyShapeArea(Shape anyShape) {
        anyShape.calculateArea();
        System.out.println(anyShape.name + "'s area is = " + anyShape.area);
    }

    public static void drawShape3Times(Shape anyShape) {

        anyShape.draw();
        anyShape.draw();
        anyShape.draw();

    }
}
