package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        /* create a long array of 5 items called salaries
        Put your salary amounts that ok for your offer
         */

        long[] salaries = {125_000, 127_500, 130_000, 97_500, 95_000};

        for (long eachOffer : salaries) {
            System.out.println("Each Offer = " + eachOffer);
        }

        for (long eachOffer : salaries             ) {
            if (eachOffer >= 100_000)
                System.out.println("offer over 100000 = " + eachOffer);
        }
        long max = salaries[0];
        for (long eachOffer : salaries){
            if (eachOffer > max)
                max = eachOffer;
        }
        System.out.println("max = " + max);
        long min = max;
        for (long eachOffer:salaries             ) {
            if (eachOffer < max)
                min = eachOffer;
        }
        System.out.println("min = " + min);
    }
}
