package day49;

public abstract class Vehicle implements Autonomous {

    int year;

    public Vehicle(int year) {
        this.year = year;
    }

    public abstract void start();

    public void goForward() {
        System.out.println("Going Forward");
    }
}
