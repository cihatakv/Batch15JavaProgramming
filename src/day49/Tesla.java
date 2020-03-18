package day49;

public class Tesla extends Vehicle implements Autonomous, Chargeable {

    int hoursePower;
    String model;

    public Tesla(int year, int hoursePower, String model) {
        super(year);
        this.hoursePower = hoursePower;
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Tesla Staring");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla selfDriving");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "hoursePower=" + hoursePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public void charge() {
        System.out.println("Tesla is bein charged");
    }
}
