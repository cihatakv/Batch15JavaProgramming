package day47;

public class Garage {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar();
        e1.start();
        e1.goForward();
        e1.goBackward();
        e1.turn("Left");
    }
}