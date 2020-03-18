package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;


    public void displayInformation() {
        System.out.println(location + " | " + company + " | " + salary + " | is Full Time? " + isFullTime);
    }

    // Write a method called turnToFullTime
    public void turnToFullTime() {
        if (!isFullTime) {
            isFullTime = true;
        } else {
            System.out.println("ALREADY FULL TIME!");
        }
    }

    // Write a method to change the location of the Offer
    // to the location user passed

    public void changeLocation(String newLocation) {
        location = newLocation;
    }

    // Write a method to accept 4 parameters to change all info
    // about offer

    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime) {

        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;

        // an instance method can call another instance method
        // an instance method can use any instance fields
        // since we already have functionality to display information
        // we called it here to display new information after modifying
        displayInformation();

    }

    // write a method to check the offer belong to 100K club and return the result as true / false

    /**
     * a method o check the offer belong to 100K club
     *
     * @return tru if salary is more than 100K, false if not
     */
    public boolean is100KOffer() {
        // salary  >= 100000 already generate a boolean result
        // so we can directly return result
        return salary >= 100000;

    }

    /**
     * @return
     */

    public String toString() {

        return "[Location = " + location + " | Company = " + company + " | Salary = $" + salary + " | isFullTime = " + isFullTime + "]";

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