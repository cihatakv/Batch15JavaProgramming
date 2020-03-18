package day30;

public class CarInventory {
    public static void main(String[] args) {
        String[] cars = {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
        // Create a class called CarInventory with main
        // count how many Chevrolet is in this array
        // and how many civic you have

        // Task 1 : count Chevrolet and Civic

        int countChevy = 0;
        int countCivic = 0;
        for (String eachCar : cars) {
            if (eachCar.contains("Chevrolet"))
                countChevy++;
            if (eachCar.contains("Civic"))
                countCivic++;
        }
        System.out.println("countChevy = " + countChevy);
        System.out.println("countCivic = " + countCivic);

    }
}
