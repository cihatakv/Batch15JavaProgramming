package day48;

public class Plane implements Flyable {

    String name;
    int capacity;
    int speed;

    public static void main(String[] args) {
        Flyable f1 = new Plane();
        System.out.println("Plane.HAVE_WING = " + Plane.HAVE_WING);

        System.out.println("Flyable.HAVE_WING = " + Flyable.HAVE_WING);
        System.out.println("HAVE_WING = " + HAVE_WING);
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }


}
