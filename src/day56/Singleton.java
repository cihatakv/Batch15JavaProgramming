package day56;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("DO NOT CALL!!");
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        else
            System.out.println("We already have this object");
        return instance;
    }

}
