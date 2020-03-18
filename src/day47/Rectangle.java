package day47;

public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(int width, int height) {
        super("My Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
