package day12;

public class CarShopping {
    public static void main(String[] args) {
        // buy Corolla or Telsa ( only if it's withing budget)
        //we don't know what car it is and what is the price
        //once we take out cloth
        //we check whether is it corolla, if it's we buy it wituoht checking price
        //if it's  not we check  if  it's Tesla and also check whether it is within budget
        String carBrand = "corolla";
        int carPrice = 9000000;
        int budget = 30000;

        // if (carBrand.equals("corolla") || carBrand.equals("Tesla") && carPrice <= budget) {
        //   System.out.println(" car acquired");
        // } else {
        //  System.out.println("not what i'am looking for");
        // }
        if(carBrand.equals("corolla")) {
            System.out.println("get corolla !!!");
        } else if(carBrand.equals("tesla")   &&   carPrice <= budget) {
            System.out.println("get the tesla bro");
        } else {
            System.out.println("not what i'am looking for");
        }
    }
}
