package day40;

import java.util.ArrayList;

public class HotMarketActions {

    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.company = "Google Inc.";
        offer1.location = "New York";
        offer1.salary = 165000;
        offer1.isFullTime = true;
        offer1.displayInformation();

        Offer offer2 = new Offer();
        offer2.company = "Apple";
        offer2.location = "San Francisco";
        offer2.salary = 160000;
        offer2.isFullTime = true;
        offer2.displayInformation();

        Offer offer3 = new Offer();
        offer3.company = "TATA Consultancy ";
        offer3.location = "Austin";
        offer3.salary = 150000;
        offer3.isFullTime = false;
        offer3.displayInformation();

        Offer offer4 = new Offer();
        offer4.company = "Hilti";
        offer4.location = "Plano";
        offer4.salary = 135000;
        offer4.isFullTime = true;
        offer4.displayInformation();

        Offer offer5 = new Offer();
        offer5.company = "Master Card";
        offer5.location = "Austin";
        offer5.salary = 135000;
        offer5.isFullTime = false;
        offer5.displayInformation();

        Offer offer6 = new Offer();

        offer6.displayInformation();

        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(offer1);
        myOffers.add(offer2);
        myOffers.add(offer3);
        myOffers.add(offer4);
        myOffers.add(offer5);
        myOffers.add(offer6);
        System.out.println("myOffers -------------- ");

        for (Offer each : myOffers) {
            each.displayInformation();
        }

        System.out.println("=============");
        for (int i = 0; i < myOffers.size(); i++) {
            myOffers.get(i).displayInformation();
        }


    }
}
/*
Create Offer class with
instance fields :
location, company, salary, isFullTime
instance methods :
displayOfferDetails -- print all info about offers
Create 5 offer objects with your ideal offers with all details ,
call displayOfferDetails method on each of them
Optionally : @channel
Store them into List<Offer> then call the method.
Optionally :
Add 5000 to each offers less than 100K
 */
