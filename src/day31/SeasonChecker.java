package day31;

public class SeasonChecker {
    public static void main(String[] args) {
        String mySeason = "Winter";
        decideSeasonAction(mySeason);
    }
    public static void decideSeasonAction(String season){
        switch (season){
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpkin picking");
                break;
            case "Winter":
                System.out.println("Go Snowboarding");
                break;
            default:
                System.out.println("INVALID SEASON");
        }
    }
}
