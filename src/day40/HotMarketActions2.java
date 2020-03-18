package day40;

public class HotMarketActions2 {

    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.company = "Google Inc.";
        offer1.location = "New York";
        offer1.salary = 165000;
        offer1.isFullTime = true;
        offer1.displayInformation();

        Offer offer2 = new Offer();
        offer2.company = "Amazon";
        offer2.location = "Austin";
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


        // Add 2K to the Amazon offer

        offer2.salary += 2000;

        System.out.println("New Amazon salary = " + offer2.salary);

        offer4.salary = offer1.salary + offer2.salary + offer3.salary;

        System.out.println("New salary = " + offer4.salary);

        // set the salary value of o4 offer object to sum of all the offers
        offer3.displayInformation();
        offer3.turnToFullTime();
        offer3.turnToFullTime();
        offer3.displayInformation();

        offer4.changeLocation("DC");
        offer4.displayInformation();


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
