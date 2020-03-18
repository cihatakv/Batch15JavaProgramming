package day47;

public class Triangle extends Shape {

    //      instance fields : int height and base
    int height;
    int base;

    // constructor
    //        to set name , height , base
    public Triangle(String name, int height, int base) {
        super(name);
        this.height = height;
        this.base = base;
    }

    @Override
    public void calculateArea() {
        area = (height * base) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }


}
