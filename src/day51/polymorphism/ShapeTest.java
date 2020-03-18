package day51.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();
        Shape s4 = new Triangle();
        Shape s5 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();
        s5.draw();

        System.out.println("------------------------");
        Shape[] manyShapes = {s1, s2, s3, s4, s5};

        for (Shape each : manyShapes) {
            each.draw();
        }

        // System.out.println(Arrays.toString(manyShapes));

        System.out.println("------------------------");

        List<Shape> lst = new ArrayList<>();

        lst.add(s1);
        lst.add(s2);
        lst.add(s3);
        lst.add(s4);

        for (Shape each : lst) {
            each.draw();
        }


    }
}
