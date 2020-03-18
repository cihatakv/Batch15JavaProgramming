package day47;

public abstract class Car {

    int year;
    String brand;

    public Car() {
        System.out.println("No Arg Const in Car");
    }

    public abstract void start();

    // add abstract void methods :
    public abstract void goForward();

    public abstract void goBackward();

    public abstract void turn(String direction);
}
