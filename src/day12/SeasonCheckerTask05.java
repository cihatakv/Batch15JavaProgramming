package day12;

import java.util.Scanner;

/*
        If Spring —>  Hiking , Navruz , Alergy Season , Cool weather
        If Summer —>> Pool , Swimming , Beach , Vacation
        If Fall —>>>  barbecue , riding bike , JUST CODE !!!! Halloween
        If Winter —>> CODE!!!!!! Ski , sledding , snowman
 */

public class SeasonCheckerTask05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season Please !!");
        String season = scan.next();

        if (season.equalsIgnoreCase("spring")){
            System.out.println("Hiking , Navruz , Alergy Season , Cool weather ");
        } else if (season.equalsIgnoreCase("summer")){
            System.out.println("Pool , Swimming , Beach , Vacation");
        } else if (season.equalsIgnoreCase("fall")){
            System.out.println("barbecue , riding bike , JUST CODE !!!! Halloween");
        } else if (season.equalsIgnoreCase("winter")){
            System.out.println("CODE!!!!!! Ski , sledding , snowman");
        } else
            System.out.println("NOT VALID !!!!!!");
    }
}
