package day45;

public class Electronic {
    static boolean useElectricity;
    String brand;

    public Electronic() {
        System.out.println("something");
    }

    public static void displayUseElectricity() {

        System.out.println("Displaying useElectricity = " + useElectricity);
    }

    public void showBrand() {
        System.out.println("brand = " + brand);
    }


}
