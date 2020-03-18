package day40;

public class HotMarketActions3 {

    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.company = "Google Inc.";
        offer1.location = "New York";
        offer1.salary = 165000;
        offer1.isFullTime = true;

        offer1.displayInformation();
        offer1.turnToFullTime();
        offer1.turnToFullTime();
        offer1.displayInformation();
        offer1.changeLocation("DC");
        offer1.displayInformation();

        offer1.changeAllInfo("Amazon", "Virginia", 150000, true);
        // offer1.displayInformation();


        // if this guy earn more than 100K
        // move him to Atlanta
        boolean result = offer1.is100KOffer();
        if (result == true) {
            offer1.changeLocation("Atlanta");
        }

//      it is same with the above code. You can do it in one shot.

//        if (offer1.is100KOffer()){
//            offer1.changeLocation("Atlanta");
//        }
        offer1.displayInformation();


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
