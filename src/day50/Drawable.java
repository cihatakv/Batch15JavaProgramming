package day50;

public interface Drawable {

    public static final String COLOR = "Blue";

    // public abstract is automatically assumed for a method without a body
    public abstract void draw();


}
/*
Create an Interface called Drawable
				it has draw method
		Create an abstract class called Shape
		it implements Drawable interface
		it has 2 fields :  String name , double area
		abstract method calculateArea();
		Create 2 concrete Shape classes called
				Square
					field : length
					instance methods : (implement all abstract methods)
					toString method
				Cirlce
					field : radius
					instance methods : (implement all abstract methods)
					toString method
 */