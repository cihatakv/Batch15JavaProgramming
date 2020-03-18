package day45;

public class Phone extends Electronic {

    // static boolean useElectricity = true;
    double size;
    double price;


    // bad idea to have main here
    // but we are doing it anyway for less screen to look at
    public static void main(String[] args) {

        Phone p1 = new Phone();
        Phone p2 = new Phone();
        p1.size = 12;
        p1.price = 399;
        p1.brand = "Apple";

        // p1.useElectricity = false;


        System.out.println("p1.useElectricity = " + p1.useElectricity);
        System.out.println("p2.useElectricity = " + p2.useElectricity);

        System.out.println("Electronic.useElectricity = " + Electronic.useElectricity);

        System.out.println("Phone.useElectricity = " + Phone.useElectricity);

        System.out.println("useElectricity *** = " + useElectricity);

        p1.showBrand();

        displayUseElectricity();

    }
}
