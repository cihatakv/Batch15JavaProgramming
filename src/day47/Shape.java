package day47;

public abstract class Shape {

    String name;
    int area;

    // add a constructor to set these name value
    public Shape(String name) {
        this.name = name;
    }

    // add a abstract void method called calculateArea
    public abstract void calculateArea();

    public abstract String toString();

}
