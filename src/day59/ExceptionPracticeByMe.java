package day59;

import day52.polymorphism.Circle;
import day52.polymorphism.Rectangle;
import day52.polymorphism.Shape;

public class ExceptionPracticeByMe {
    public static void main(String[] args) {
        Shape s1 = new Circle("a", 5);
        try {
            System.out.println("Entered Trying block");
            Rectangle r1 = (Rectangle) s1;
            System.out.println("Assigned s1 to r1");
        } catch (Exception e) {
            System.out.println("Exited from try block since unable to assign s1 to r1");
        } finally {
            System.out.println("Finally exit from either try or catch");
        }

        System.out.println("End of Main");


    }
}
