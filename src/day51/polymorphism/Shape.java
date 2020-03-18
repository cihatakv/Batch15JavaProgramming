package day51.polymorphism;

public abstract class Shape {
    public abstract void draw();
}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("DRAWING TRIANGLE");
    }

    @Override
    public String toString() {
        return "Triangle{}";
    }
}


class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("DRAWING RECTANGLE");
    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("DRAWING CIRCLE");
    }

    @Override
    public String toString() {
        return "Circle{}";
    }
}