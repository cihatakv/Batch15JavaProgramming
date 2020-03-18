package day55;

public class TaxiAction {
    public static void main(String[] args) {

        Driver d1 = new Driver("John", 1234);
        Engine e1 = new Engine("V6", 400);
        Taxi t1 = new Taxi(1234, e1, d1);

        System.out.println("d1 = " + d1);
        System.out.println("e1 = " + e1);
        System.out.println("t1 = " + t1);

        Taxi t2 = new Taxi(102,
                new Engine("V8", 600),
                new Driver("John", 12345));
        System.out.println("t2 = " + t2);

        int x = t2.plateNumber;
        Driver y = t2.dr;
        System.out.println("y = " + y);


        System.out.println("driver name = " + t2.dr.name);
        System.out.println("Engine horse Power " + t2.eng.horsePower);
        System.out.println("Driver name first char >> " + t2.dr.name.charAt(0));


    }


}
