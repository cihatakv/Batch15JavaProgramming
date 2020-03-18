package day47;

public class ElectricCar extends Car {
    int batteryLevel;

    @Override
    public void start() {
        System.out.println("This is how electric car start");
    }

    @Override
    public void goForward() {
        System.out.println("Going Forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Going Backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Turning " + direction);
    }
}
